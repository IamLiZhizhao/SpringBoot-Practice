package com.lizhizhao.springboot.practice.controller;

import com.lizhizhao.springboot.practice.annotation.LogInfo;
import com.lizhizhao.springboot.practice.entity.StudentDO;
import com.lizhizhao.springboot.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lizhizhao
 * @since 2020-06-01 16:48
 */
@RequestMapping("student")
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @LogInfo("获取学生")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public StudentDO get(String sno) {
        return studentService.queryStudentBySno(sno);
    }




//    public static ThreadLocal<StudentDO> studentDOThreadLocal = new ThreadLocal<>();
//
//    public final static int ThreadSize = 10;
//
//    public static void main(String []args) {
////    public Boolean initStudent(){
//        ExecutorService threadPool = Executors.newFixedThreadPool(ThreadSize);
//
//        for (int i = 0; i < 5; i++) {
//            int nameNum = i;
//            threadPool.submit(() -> {
//                String sno = UUID.randomUUID().toString().replaceAll("-", "");
//                String name = "lzz" + nameNum;
//                String sex = nameNum%2 == 0 ? "man" : "woman";
//                BigDecimal score = BigDecimal.valueOf(Math.random() * 100);
//                studentDOThreadLocal.set(new StudentDO(sno, name, sex, score));
//                System.out.println(studentDOThreadLocal.get().toString());
//            });
//        }
//
//        threadPool.shutdown();
////        return true;
//    }


}
