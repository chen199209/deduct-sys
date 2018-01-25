package com.sys.deduct.service;

import com.sys.deduct.domain.User;

import java.util.List;

public interface UserService {

    public User findById(Integer userId);

    public User findByName(String userName);

    public List<User> findAllUser();
}
