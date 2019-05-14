package com.binarapps.codechallenge.controller;

import java.util.List;
import java.util.Optional;

import com.binarapps.codechallenge.model.User;
import com.binarapps.codechallenge.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    public Optional<User> getUserId(@PathVariable(value = "idUser") Long idUser){
        return userService.getUserId(idUser);
    }

    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    public void updateUser(@RequestBody User user, @PathVariable Long idUser){
        userService.updateUser(idUser, user);
    }

    public void deleteUser(@PathVariable Long idUser){
        userService.deleteUser(idUser);
    }


}