package com.yjmer.user.service.impl;

import com.yjmer.user.mapper.UserMapper;
import com.yjmer.user.pojo.User;
import com.yjmer.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }

}

