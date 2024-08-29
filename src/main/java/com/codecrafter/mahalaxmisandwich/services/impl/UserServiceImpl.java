package com.codecrafter.mahalaxmisandwich.services.impl;

import com.codecrafter.mahalaxmisandwich.entities.User;
import com.codecrafter.mahalaxmisandwich.repositories.IUserRepository;
import com.codecrafter.mahalaxmisandwich.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
