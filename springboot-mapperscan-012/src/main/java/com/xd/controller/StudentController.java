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

    @RequestMapping("/student/query")
    @ResponseBody
    public String queryStudentById(Integer id){
        Student student = studentService.queryStudentById(id);
        return student.toString();
    }

}
