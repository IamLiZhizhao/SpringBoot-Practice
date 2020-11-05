package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.dto.PersonDest;
import com.lizhizhao.springboot.practice.dto.PersonSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringBeanUtils {

    @Test
    public void testSpringBeanUtils()  {
       //下面只是用于单独测试
        PersonSource personSource = new PersonSource(1, "pjmike", "12345", 21);
        PersonDest personDest = new PersonDest();
        BeanUtils.copyProperties(personSource, personDest);
        System.out.println("persondest: " + personDest);
    }

}