package com.qbn.controller;

import com.qbn.domain.Student;
import com.qbn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/test.do")
    public void test(){
        Student student=new Student();
        student.setName("");
        student.setId(11);
        String [] arry={"10","11","12"};
        List<Student> studentList= studentService.selectStudentObjct(arry);
        for (Student stu:studentList){
            System.out.println(stu);
        }
    }
}
