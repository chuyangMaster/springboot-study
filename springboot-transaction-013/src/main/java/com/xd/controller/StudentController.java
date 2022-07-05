package com.xd.controller;

import com.xd.domain.Student;
import com.xd.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(Student student){
        int count = studentService.addStudent(student);
        if(count < 0){
            return "添加记录失败";
        }

        return "添加记录成功";
    }
}
