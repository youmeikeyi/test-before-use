package com.meki.test.service.impl;

import com.meki.test.dao.UserDAO;
import com.meki.test.model.User;
import com.meki.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
 
    @Autowired
    private UserDAO userDAO;
     
    @Override
    public int addUser(User user) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(user);
    }
 
}