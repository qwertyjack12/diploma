package com.application.diploma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Users;
import com.application.diploma.repository.UsersRepository;

@Service
public class UsersService {
    private final UsersRepository userRepository;

    public UsersService(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public Boolean add(Users user) {
        try {
            /*
             * String password = user.getPassword();
             * password = encodedPassowed(password);
             * user.setPassword(password)
             */;
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

    /*
     * private String encodedPassowed(String password) {
     * PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     * String encodedPassword = passwordEncoder.encode(password);
     * return encodedPassword;
     * }
     */
}
