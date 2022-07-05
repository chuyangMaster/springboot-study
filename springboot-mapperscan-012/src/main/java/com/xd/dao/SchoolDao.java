package com.xd.dao;

import com.xd.domain.Student;
import org.apache.ibatis.annotations.Mapper;

public interface SchoolDao {

    public Student queryStudentById(Integer id);
}
