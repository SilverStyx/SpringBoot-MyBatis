package com.silverstyx.blog.controller;

import com.silverstyx.blog.model.User;
import com.silverstyx.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @PostMapping("/all")
    public Object findAllUser( @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                           int pageNum,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                           int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
