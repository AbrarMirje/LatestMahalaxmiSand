package com.codecrafter.mahalaxmisandwich.controllers;

import com.codecrafter.mahalaxmisandwich.entities.User;
import com.codecrafter.mahalaxmisandwich.services.IUserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostConstruct
    public void createFirstAdmin(){
        User firstUser = new User();
        firstUser.setUserId(1L);
        firstUser.setUserName("admin1@gmail.com");
        firstUser.setPassword("admin@123");

        userService.saveUser(firstUser);


        User secondUser = new User();
        secondUser.setUserId(2L);
        secondUser.setUserName("admin2@gmail.com");
        secondUser.setPassword("admin123");

        userService.saveUser(secondUser);
    }
}
