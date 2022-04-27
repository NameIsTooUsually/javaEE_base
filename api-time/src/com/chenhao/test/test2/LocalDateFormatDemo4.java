package com.chenhao.test.test2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatDemo4 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2022, 3, 28, 17, 8, 56);
        LocalDateTime localDateTime1 = localDateTime.withSecond(59);
        System.out.println(localDateTime1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd  HH:mm:ss");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }
}
