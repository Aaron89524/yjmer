package com.yjmer.user.controller;

import com.yjmer.user.pojo.User;
import com.yjmer.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Hashtable;

@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping({"index",""})
    public String hello() {
        return "index";
    }

    @GetMapping("detail")
    public String detail() {
        return "project-details";
    }

    @Autowired
    private IUserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id) {
        return userService.queryUserById(id);
    }

}
