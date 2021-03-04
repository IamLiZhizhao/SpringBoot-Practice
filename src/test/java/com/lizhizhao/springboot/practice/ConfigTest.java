package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.dto.ConfigTestDO;
import com.lizhizhao.springboot.practice.dto.ConfigTest1DO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lizhizhao
 * @since 2020-09-21 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

    @Autowired
    ConfigTestDO testDO;

    @Autowired
    ConfigTest1DO test1DO;

    @Test
    public void test() {
        System.out.println(testDO);
        System.out.println(testDO.getName());
        System.out.println(testDO.getAge());
        System.out.println(test1DO);
        System.out.println(test1DO.getName());
        System.out.println(test1DO.getAge());
    }


}
