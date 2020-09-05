package com.atguigu.service;

import com.atguigu.pojo.User;
import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> listUsers(){
        return userDao.listUsers();

    }
}
