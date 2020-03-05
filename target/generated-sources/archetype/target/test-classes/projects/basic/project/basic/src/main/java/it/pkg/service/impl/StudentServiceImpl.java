package it.pkg.service.impl;

import it.pkg.domain.Student;
import it.pkg.mapper.StudentMapper;
import it.pkg.service.StudentService;
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
