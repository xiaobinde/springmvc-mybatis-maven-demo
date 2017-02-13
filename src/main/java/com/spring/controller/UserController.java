package com.spring.controller;


import com.spring.pojo.User;
import com.spring.pojo.UserExample;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by liuhb on 2017/2/13.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名称查询用户信息
     * @param model
     * @param username
     * @return
     */
    @RequestMapping(value = "userlist",method = RequestMethod.GET)
    public String queryUserByName(Model model,String username){

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("spring");
        List<User>userList = userService.queryUserByName(userExample);
        model.addAttribute("userList",userList);

        return "userlist";
    }



}
