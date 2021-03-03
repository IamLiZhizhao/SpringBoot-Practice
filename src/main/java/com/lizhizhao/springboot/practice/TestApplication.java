package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.service.ProviderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
		ProviderService providerService=context.getBean(ProviderService.class);
		System.out.println(providerService.SayHello("hello world!"));
	}

}
