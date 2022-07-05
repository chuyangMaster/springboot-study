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
    public Student queryStudent(Integer id) {
        Student student = studentDao.queryStudent(id);
        return student;
    }

    @Override
    public int dropStudent(Integer id) {
        int count = studentDao.dropStudent(id);
        return count;
    }

    @Override
    public int addStudent(Student student) {
        int count = studentDao.addStudent(student);
        return count;
    }

    @Override
    public int alterStudent(Integer id, String name) {
        int count = studentDao.alterStudent(id, name);
        return count;
    }
}
