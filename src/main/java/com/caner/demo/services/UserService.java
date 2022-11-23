package com.caner.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.caner.demo.entities.User;


import com.caner.demo.repos.HastaRepository;
import com.caner.demo.repos.UserRepository;

@Service

public class UserService {

    UserRepository userRepository;
    HastaRepository hastaRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.hastaRepository = hastaRepository;

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveOneUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User getOneUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateOneUser(Long userId, User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        } else
            return null;
    }

    public void deleteById(Long userId) {
        try {
            userRepository.deleteById(userId);
        } catch (EmptyResultDataAccessException e) { //user zaten yok, db'den empty result gelmiş
            System.out.println("User " + userId + " doesn't exist"); //istersek loglayabiliriz
        }
    }

    public User getOneUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public List<Object> getUserActivity(Long userId) {



        List<Object> result = new ArrayList<>();

        return result;
    }
}



