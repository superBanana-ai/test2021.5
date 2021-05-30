package com.qbn.service.impl;

import com.qbn.dao.StudentDao;
import com.qbn.domain.Student;
import com.qbn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao dao;

    @Override
    public List<Student> selectStudentParm(String name, Integer id) {
        List<Student> studentList= dao.queryStudentParm(name,id);


        return studentList;
    }

    @Override
    public List<Student> selectStudentObjct(String [] arry) {
        List<Student> studentList= dao.queryStudentObjct(arry);
        return studentList;
    }

    @Override
    public List<Student> selectStudents() {
        List<Student> list= dao.queryStudents();
        return list;
    }
}
