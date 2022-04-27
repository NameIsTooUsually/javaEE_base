package com.chenhao.test.test2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo2 {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2022, 4, 1, 18, 35, 59);

        //获取年份
        int year = of.getYear();
        System.out.println("年为："+year);

        //获取月份
        int monthValue = of.getMonthValue();
        System.out.println("月份为："+monthValue);

        //获取日期
        int dayOfMonth = of.getDayOfMonth();
        DayOfWeek dayOfWeek = of.getDayOfWeek();
        int dayOfYear = of.getDayOfYear();
        System.out.println("这一天在一年中是第"+dayOfYear+"天");
        System.out.println("这一天在一个月中是第"+dayOfMonth+"天");
        System.out.println("这一天在一个星期中是第"+dayOfWeek+"天");

        //获取小时
        int hour = of.getHour();
        System.out.println("小时为："+hour);

        //获取分钟
        int minute = of.getMinute();
        System.out.println("分钟为："+minute);

        //获取秒
        int second = of.getSecond();
        System.out.println("秒为："+second);

        System.out.println("它就是："+of);

        LocalDate.now();
    }
}
