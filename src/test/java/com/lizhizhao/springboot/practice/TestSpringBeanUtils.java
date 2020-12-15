package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.dto.PersonDest;
import com.lizhizhao.springboot.practice.dto.PersonSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


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

    @Test
    public void testAutowired()  {
        

        List<Class> classList = new ArrayList<>();
        ClassLoader classLoader = PracticeApplication.class.getClassLoader();
        URL url = classLoader.getResource("com/lizhizhao/springboot/practice/entity");
        File f = new File(url.getFile());
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                String absolutePath = file.getAbsolutePath();
                System.out.println(absolutePath);
                absolutePath = absolutePath.substring(absolutePath.indexOf("com"), absolutePath.indexOf(".class"));
                System.out.println(absolutePath);
                absolutePath = absolutePath.replaceAll("\\\\",".");
                System.out.println(absolutePath);
                try {
                    Class<?> clazz = classLoader.loadClass(absolutePath);
                    classList.add(clazz);
                    System.out.println(clazz);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        // 把class实例化-单例
        for (Class clazz : classList) {
            System.out.println(clazz);
        }
    }

}