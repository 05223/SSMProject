#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student getStudentBySnumber(Integer snumber);
}
