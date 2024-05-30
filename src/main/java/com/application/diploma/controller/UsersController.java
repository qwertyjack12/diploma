package com.application.diploma.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Users;
import com.application.diploma.service.UsersService;

@RestController
public class UsersController {

    private final UsersService userService;

    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping("/user_card")
    public List<Users> getALlUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user_card/{id}")
    public Optional<Users> getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @PostMapping("/user_card/add")
    public Boolean add(@RequestBody Users user) {
        System.out.println("model is " + (user == null ? "nope " : user.getFirst_name()));
        return userService.add(user);
    }

    @DeleteMapping("/user_card/delete/{id}")
    public Boolean deleteById(@PathVariable("id") Integer id) {
        System.out.println("Deleting user with ID: " + id);
        return userService.deleteById(id);
    }

    @DeleteMapping("/user_card/delete")
    public Boolean delete(@RequestBody Users user) {
        System.out.println("Deleting user with ID: " + user.getPk_user_id());
        return userService.delete(user);
    }
}
