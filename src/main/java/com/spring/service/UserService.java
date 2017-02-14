package com.spring.service;

import com.spring.pojo.User;
import com.spring.pojo.UserExample;

import java.util.List;

/**
 * Created by liuhb on 2017/2/13.
 */
public interface UserService {
    User getUserById(long userid);

    List<User> queryUserByName(UserExample userExample);

    int editUser(User user);

    int deleteUserById(long userId);

    int addUser(User user);

}
