package com.alex.dao;

import com.alex.model.User;

import java.util.List;

public class UserDao {

    public List<User> findAll() {
        return List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name3")
        );
    }
}
