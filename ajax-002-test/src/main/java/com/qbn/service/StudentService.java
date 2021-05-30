package com.qbn.service;

import com.qbn.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectStudents();
    List<Student> selectStudentParm(String name,Integer id);
    List<Student> selectStudentObjct(String [] arry);
}
