package com.alex.service;

import com.alex.dao.UserDao;
import com.alex.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> findAll() {
        return userDao.findAll();
    }
}
