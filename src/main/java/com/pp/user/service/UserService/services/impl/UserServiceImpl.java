package com.pp.user.service.UserService.services.impl;

import com.pp.user.service.UserService.entities.User;
import com.pp.user.service.UserService.exeptions.ResourceNotFoundException;
import com.pp.user.service.UserService.repository.UserRepository;
import com.pp.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String string = UUID.randomUUID().toString();
        user.setUserId(string);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on server !! : "+ userId));
    }
}
