package com.spring.controller;


import com.spring.pojo.User;
import com.spring.pojo.UserExample;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;
import java.util.Date;
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
//        userExample.createCriteria().andUsernameEqualTo("spring");
        List<User>userList = userService.queryUserByName(userExample);
        model.addAttribute("userList",userList);
        return "userList";

    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "editUser",method = RequestMethod.POST)
    public String editUser(User user){
        user.setUpdated(new Date());
        userService.editUser(user);
        return "redirect:userlist";
    }

    /**
     * 根据id删除用户信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "deleteUser",method = RequestMethod.DELETE)
    public String deleteUserById(long userId){
        userService.deleteUserById(userId);
        return "redirect:userlist";
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(User user){
        userService.addUser(user);
        return "success";
    }

    /**
     * 跳转到修改页面
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping(value = "editUserPage/{userId}",method = RequestMethod.GET)
    public String editUserPage(Model model, @PathVariable(value = "userId")long userId){
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "editUser";
    }


}
