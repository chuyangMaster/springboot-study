package com.xd.dao;

import com.xd.domain.Student;

public interface StudentDao {

    Student queryStudent(Integer id);

    int dropStudent(Integer id);

    int addStudent(Student student);

    int alterStudent(Integer id, String name);

}
