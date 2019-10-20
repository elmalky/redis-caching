package com.sa.saproject.controller;


import com.sa.saproject.configuration.ApplicationConfiguration;
import com.sa.saproject.model.User;
import com.sa.saproject.service.UserSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserSerivice userSerivice;

    @Autowired
    ApplicationConfiguration properties;

    @GetMapping("/addUser")
    public User getUser() {
        User user = new User();
        user.setUserName("ashraf");
        user.setAdress("adress");
        return userSerivice.addUser(user);
    }

    @GetMapping("/users")
    @Cacheable(value = "users")
    public Iterable<User> getAllUsers() {
        System.out.println("method extecuted ...");
        return userSerivice.getAllUsers();
    }

    @GetMapping("/properties")
    public String getProperties() {

        return properties.getRedis().getRedisHost()+" "+properties.getRedis().getRedisPort();
    }

}
