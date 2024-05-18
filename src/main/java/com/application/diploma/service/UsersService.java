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
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
