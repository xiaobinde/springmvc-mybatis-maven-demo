package com.spring.service.impl;

import com.spring.mapper.UserMapper;
import com.spring.pojo.User;
import com.spring.pojo.UserExample;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuhb on 2017/2/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        return user;
    }

    @Override
    public List<User> queryUserByName(UserExample userExample) {
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUserById(long userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
