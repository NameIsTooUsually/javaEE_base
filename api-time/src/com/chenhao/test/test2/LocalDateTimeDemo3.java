package com.chenhao.test.test2;

import javax.xml.stream.XMLOutputFactory;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeDemo3 {
    public static void main(String[] args) {
        //localdatetime 的格式化和解析

        DateTimeFormatter mFormate = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");


        LocalDateTime of = LocalDateTime.of(2022, 3, 28, 15, 54, 56);
        String format = of.format(mFormate);
        System.out.println(format);

        String time = "2022年03月28日 15时54分56秒";
        LocalDateTime parse = LocalDateTime.parse(time, mFormate);
        System.out.println(parse);

        SimpleDateFormat simp = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
    }
}
