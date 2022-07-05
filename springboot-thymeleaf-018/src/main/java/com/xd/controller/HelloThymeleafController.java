package com.xd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloThymeleafController {

    @GetMapping("/hello")
    public String hello(Model model, HttpServletRequest request){
        request.setAttribute("data", "欢迎使用Thymeleaf模板引擎");

        model.addAttribute("modelData", "model中的数据");
        return "hello";
    }
}
