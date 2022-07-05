package com.xd.service.impl;

import com.xd.dao.StudentDao;
import com.xd.domain.Student;
import com.xd.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentDao.queryStudentById(id);
        return student;
    }
}
