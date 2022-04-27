package com.chenhao.day04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08
 */
public class Test1 {
    public static void main(String[] args) {
        //LocalDateTime通过它的静态方法，创建一个时间对象
        LocalDateTime l = LocalDateTime.now();
        //DateTimeFormatter静态方法创建一个创建一个日期格式的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //通过格式化对象，该时间对象格式化并且输出
        System.out.println(l.format(dateTimeFormatter));
    }
}
