package com.hwua.service;

import com.hwua.domain.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student getStudentBySnumber(Integer snumber);
}
