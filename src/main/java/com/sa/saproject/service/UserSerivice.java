package com.sa.saproject.service;


import com.sa.saproject.model.User;
import com.sa.saproject.repository.UserRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivice {
    @Autowired
    UserRepositiry userRepositiry;
    public User addUser(User user){
        return userRepositiry.save(user);
    }
    public Iterable<User> getAllUsers(){
        return userRepositiry.findAll();
    }

}
