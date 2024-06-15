package com.application.diploma.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.diploma.entity.Users;
import com.application.diploma.repository.RoleRepository;
import com.application.diploma.repository.UsersRepository;

@Service
public class UsersService implements UserDetailsService {
    private final UsersRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UsersService(UsersRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public Optional<Users> findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = findByLogin(username).orElseThrow(() -> new UsernameNotFoundException(
                String.format("Not found: '%s'", username)));

        return new User(
                user.getLogin(),
                user.getPassword(),
                user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName()))
                        .collect(Collectors.toList()));
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public Boolean add(Users user) {
        try {
            if (user.getAccess_rights() == "true") {
                user.setAccess_rights("администратор");
                user.setRoles(List.of(roleRepository.findByName("ROLE_ADMIN").get()));
            } else {
                user.setAccess_rights("пользователь");
                user.setRoles(List.of(roleRepository.findByName("ROLE_USER").get()));
            }
            user.setPassword(encodedPassowed(user.getPassword()));
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean edit(Users user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Users user) {
        try {
            userRepository.delete(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean deleteById(Integer id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String encodedPassowed(String password) {
        String encodedPassword = passwordEncoder.encode(password);
        return encodedPassword;
    }
}
