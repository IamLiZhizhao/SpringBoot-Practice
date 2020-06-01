package com.lizhizhao.springboot.practice.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadLocal使用测试
 *
 * @author lizhizhao
 * @since 2020-06-01 11:24
 */
public class ThreadLocalUsage {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = ThreadLocal.withInitial(()-> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static void main(String []args) {
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            threadPool.submit(()->{
                String date = new ThreadLocalUsage().date(finalI);
                System.out.println(date);
//                System.out.println(new ThreadLocalUsage().getI(finalI));
            });
        }
        // 关闭线程池，此种关闭方式不再接受新的任务提交，等待现有队列中的任务全部执行完毕之后关闭
        threadPool.shutdown();
    }

    private String date(int seconds){
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        SimpleDateFormat simpleDateFormat = dateFormatThreadLocal.get();
        return simpleDateFormat.format(date);
    }

    private Integer getI(int i){
        return Integer.valueOf(i);
    }

}
