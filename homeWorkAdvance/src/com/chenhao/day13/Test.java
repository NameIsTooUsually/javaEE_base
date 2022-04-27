package com.chenhao.day13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
模拟实现一个定时器，每隔1秒输出一下表示当前时间的字符串
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            //获取当前时间
            LocalDateTime now = LocalDateTime.now();
            //创建时间格式化对象
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm;ss");
            System.out.println(now.format(dateTimeFormatter));
        }
    }
}
