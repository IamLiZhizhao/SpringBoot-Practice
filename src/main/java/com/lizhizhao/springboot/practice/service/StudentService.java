package com.lizhizhao.springboot.practice.service;

import com.lizhizhao.springboot.practice.entity.StudentDO;

public interface StudentService {
	int add(StudentDO student);
    int update(StudentDO student);
    int deleteBysno(String sno);
    StudentDO queryStudentBySno(String sno);
}
