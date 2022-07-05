package com.xd.service;

import com.xd.domain.Student;

public interface StudentService {

    Student queryStudent(Integer id);

    int dropStudent(Integer id);

    int addStudent(Student student);

    int alterStudent(Integer id, String name);
}
