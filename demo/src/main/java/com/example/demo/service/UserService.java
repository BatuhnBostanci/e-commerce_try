package com.example.demo.service;

import com.example.demo.entitiy.Basket;
import com.example.demo.entitiy.User;
import com.example.demo.repository.BasketRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BasketRepository basketRepository;

    public User toEntity(UserRequest userRequest) {
        User user = new User();
        user.setUseremail(userRequest.getEmail());
        user.setUserpassword(userRequest.getPassword());
        user.setUserfullname(userRequest.getUsername());
        return user;
    }

    public UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setName(user.getUserfullname());
        return userResponse;
    }

    public UserResponse createUser(UserRequest userRequest) {
        User user = toEntity(userRequest);
        Basket basket = new Basket();
        basketRepository.save(basket);
        user.setUserBasket(basket);
        userRepository.save(user);
        return toResponse(user);
    }


    public UserResponse getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponses = new ArrayList<>();

        for (User user : users) {
            userResponses.add(toResponse(user));
        }
        return (UserResponse) userResponses;
    }
}
