package com.hwua.service.impl;

import com.hwua.domain.Student;
import com.hwua.mapper.StudentMapper;
import com.hwua.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student getStudentBySnumber(Integer snumber) {
        return studentMapper.selectStudentByPrimaryKey(snumber);
    }
}
