/*package com.caner.demo.services;

import com.caner.demo.entities.User;
import com.caner.demo.repos.UserRepository;

import com.caner.demo.responses.UserResponse;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserManager implements UserService {
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    public UserManager(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long Id) {
        Optional<User> opuser = userRepository.findById(Id);

        if (opuser.isPresent()) {
            return opuser.get();

        }
        return null;
    }

    @Override
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

    @Override
    public User getOneUserById(Long userId) {
        return this.userRepository.findById(userId).orElse(null);
    }

    @Override
    public UserResponse addUser(User user) throws Exception {

        User user1=new User();
        user1.setUserName(user.getUserName());
        System.out.println(user.getPassword());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));
        User registereduser=userRepository.save(user1);
        UserResponse userres=new UserResponse();
        userres.setId(registereduser.getId());
        userres.setUserName(registereduser.getUserName());
        return userres;
    }
    public void deleteById(Long userId) {
        userRepository.deleteById(userId);

    }

    @Override
    public User getOneUserByUserName(String userName) {
        return null;
    }

    @Override
    public boolean isValidUsername(String username) {
       /* if (existByUserName(username)){
            return false;
        }
        if (username.isBlank()){
            return false;
        }
        Pattern VALID_EMAIL_ADDRESSREGEX =
                Pattern.compile("(^[A-Z0-9.%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESSREGEX.matcher(username);
        if (!matcher.find()){
            return false;


        }
        return true;
    }

    @Override
    public boolean isValidPassword(String password) {


      /*  if (password.isBlank()){
            return false;
        }
        Pattern VALID_PASSWORD_REGEX =
                Pattern.compile("^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        if (!matcher.find()){
            return false;


        }
        return true;

    }

    @Override
    public Arrays getAllUsers() {
        return null;
    }

    @Override
    public void saveOneUser(User user) {

    }

    @Override
    public boolean existByUserName(String username) {
        return userRepository.existsByUserName(username);
    }
}*/