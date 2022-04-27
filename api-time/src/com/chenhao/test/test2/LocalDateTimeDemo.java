package com.chenhao.test.test2;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(2022, 3, 28, 14, 59,10);
        System.out.println(of);
        int second = of.getSecond();
        System.out.println(second);
    }
}
