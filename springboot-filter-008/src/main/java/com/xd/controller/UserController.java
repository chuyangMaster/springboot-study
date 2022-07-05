package com.xd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "user/account访问成功";
    }

    @RequestMapping("/aloha")
    @ResponseBody
    public String aloha(){
        return "aloha";
    }

}
