package com.binarapps.codechallenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepository.findAll()
        .forEach(users::add);
        return users;
    }

    public Optional<User> getUserId(Long id){
        return userRepository.findById(id);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateUser(Long id, User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}