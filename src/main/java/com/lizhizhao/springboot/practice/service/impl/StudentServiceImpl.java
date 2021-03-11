package com.lizhizhao.springboot.practice.service.impl;

import com.lizhizhao.springboot.practice.entity.StudentDO;
import com.lizhizhao.springboot.practice.mapper.StudentMapper;
import com.lizhizhao.springboot.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生服务实现类
 *
 * @author lizhizhao
 * @since 2021-03-03 17:59
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(StudentDO student) {
        return studentMapper.add(student);
    }

    @Override
    public StudentDO update(StudentDO student) {
        this.studentMapper.update(student);
        return this.studentMapper.queryStudentBySno(student.getSno());
    }

    @Override
    public void deleteBysno(String sno) {
        studentMapper.deleteBysno(sno);
    }

    @Override
    public StudentDO queryStudentBySno(String sno) {
        return studentMapper.queryStudentBySno(sno);
    }
}
