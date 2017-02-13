package com.spring.service;

import com.spring.pojo.User;
import com.spring.pojo.UserExample;

import java.util.List;

/**
 * Created by liuhb on 2017/2/13.
 */
public interface UserService {
    public User getUserById(long userid);

    public List<User> queryUserByName(UserExample userExample);
}
