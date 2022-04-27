package com.chenhao.day04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
需求：,把2018-03-04转换为2018年03月04日。
 */
public class Test2 {
    public static void main(String[] args) {

        String str = "2018-03-04";
        //创建一个日期格式化类对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //将str解析成一个日期类对象
        LocalDate parse = LocalDate.parse(str, dateTimeFormatter);
        //再创建一个日期格式化类对象
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //将日期类对象按照年月日格式化并输出
        System.out.println(parse.format(dateTimeFormatter1));
    }
}
