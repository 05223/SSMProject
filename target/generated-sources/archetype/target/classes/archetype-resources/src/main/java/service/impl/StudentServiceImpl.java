#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.domain.Student;
import ${package}.mapper.StudentMapper;
import ${package}.service.StudentService;
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
