package com.xd.controller;

import com.xd.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tpl")
public class ThymeleafController {

    //标准变量表达式
    @GetMapping("/expression1")
    public String expression1(Model model){
        model.addAttribute("site", "www.chuyangxunfeng.com");
        model.addAttribute("myuser", new SysUser(100, "甘雨", "女", 20));

        return "expression1";
    }

    //选择变量表达式
    @GetMapping("/expression2")
    public String expression2(Model model){
        model.addAttribute("site", "www.chuyangxunfeng.com");
        model.addAttribute("myuser", new SysUser(101, "刻晴", "女", 20));

        return "expression2";
    }

    //链接变量表达式
    @GetMapping("/expression3")
    public String expression3(Model model){
        model.addAttribute("stuId", 100);
        return "expression3";
    }

    @GetMapping("/query/student")
    @ResponseBody
    public String query1(Integer id){
        return "查询学生的学号是:" + id;
    }

    @GetMapping("/query/school")
    @ResponseBody
    public String query2(Integer id, String name){
        return "查询学生的学号是:" + id + "；姓名是：" + name;
    }

    @GetMapping("/setProperty")
    public String property(Model model){
        model.addAttribute("method", "post");
        model.addAttribute("paraname", "name");
        model.addAttribute("value", "张三");

        return "property";
    }

    @PostMapping("/getProperty")
    @ResponseBody
    public String getProperty(String name){
        return "Controller层接收到的参数是：" + name;
    }

}
