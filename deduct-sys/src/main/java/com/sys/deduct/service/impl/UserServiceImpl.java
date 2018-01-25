package com.sys.deduct.service.impl;

import com.sys.deduct.dao.UserMapper;
import com.sys.deduct.domain.User;
import com.sys.deduct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByName(String userName) {
        return userMapper.findByName(userName);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
