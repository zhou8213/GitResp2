package com.zhou.service.impl;

import com.zhou.mapper.UserMapper;
import com.zhou.pojo.User;
import com.zhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: xiao zhou student
 * @Date: 2022/1/22 - 01 - 22 - 18:13
 * @Description: com.zhou.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
