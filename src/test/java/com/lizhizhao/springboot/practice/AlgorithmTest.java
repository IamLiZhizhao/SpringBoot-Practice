package com.lizhizhao.springboot.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lizhizhao
 * @since 2020-09-21 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgorithmTest {


    public String runExam(int n) {
        StringBuffer sb = new StringBuffer();
        while (n>=1) {
            if (n%2 == 0) {
                sb.append(2);
                n = (n-2)/2;
            } else {
                sb.append(1);
                n = (n-1)/2;
            }
        }
        return sb.reverse().toString();
    }


    @Test
    public void test() {
        System.out.println(mySqrt(8));
    }

    private int mySqrt(int x) {
        if (x <= 1) return x;
        long left = 1;
        long right = x/2;
        while (left < right) {
            long mid = left + (right-left+1)/2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int)left;
    }

}
