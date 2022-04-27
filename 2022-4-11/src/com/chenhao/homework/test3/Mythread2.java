package com.chenhao.homework.test3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            //创建一个时间对象，并获取当前时间
            LocalDateTime now = LocalDateTime.now();
            //创建一个时间格式对象
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            //格式化并打印
            System.out.println(now.format(dateTimeFormatter));
            //sleep一秒
            if(9!=i){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
