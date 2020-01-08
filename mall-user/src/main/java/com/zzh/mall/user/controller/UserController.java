package com.zzh.mall.user.controller;

import com.zzh.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/ums/user")
@Controller
public class UserController {
    @Autowired
    UserService userService;



    @RequestMapping("/index")
    @ResponseBody
    public String index(){
       return "zzh";
    }
}
