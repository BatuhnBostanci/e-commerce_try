package com.example.demo.controller;

import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return (List<UserResponse>) userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable long id) {
        return;
    }
}
