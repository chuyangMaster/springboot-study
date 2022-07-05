package com.xd.service.impl;

import com.xd.dao.StudentMapper;
import com.xd.domain.Student;
import com.xd.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * @Transactional:表示该方法有事务支持
     *  默认:使用库的隔离级别，REQUIRED    传播时间：-1
     *  抛出运行时异常，回滚事务
     * @param student
     * @return
     */
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int count = studentMapper.insert(student);
        System.out.println("执行sql语句");

        //抛出一个运行时异常
        //int m = 10 / 0;

        return count;
    }
}
