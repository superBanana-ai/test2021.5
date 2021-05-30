package com.qbn.dao;

import com.qbn.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> queryStudents();
    List<Student> queryStudentParm(@Param("myname") String name,
                                   @Param("myid") Integer id);
    List<Student> queryStudentObjct(String [] arry);
}
