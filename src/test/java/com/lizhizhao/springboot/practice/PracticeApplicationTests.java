package com.lizhizhao.springboot.practice;

import com.lizhizhao.springboot.practice.enums.LimiterStrategyEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello ");
	}



	@Test
	public void test() {
		System.out.println(LimiterStrategyEnum.RATE_LIMITER.name());
	}

}
