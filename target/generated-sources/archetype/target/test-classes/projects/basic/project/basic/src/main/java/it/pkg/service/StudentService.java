package it.pkg.service;

import it.pkg.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student getStudentBySnumber(Integer snumber);
}
