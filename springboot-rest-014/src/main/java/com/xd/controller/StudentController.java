package com.xd.controller;

import com.xd.domain.Student;
import com.xd.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/student")
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }

    @PostMapping("/student")
    public String addStudent(Student student){
        int count = studentService.addStudent(student);
        if(count == 1){
            return "添加成功";
        }
        return "添加失败";
    }

    @DeleteMapping("/student")
    public String dropStudent(Integer id){
        int count = studentService.dropStudent(id);
        if(count == 0){
            return "删除失败";
        }

        return "删除成功";
    }

    @PutMapping("/student")
    public String alterStudent(Integer id, String name){
        int count = studentService.alterStudent(id, name);
        if(count == 0){
            return "修改失败";
        }

        return "修改成功";
    }
}
