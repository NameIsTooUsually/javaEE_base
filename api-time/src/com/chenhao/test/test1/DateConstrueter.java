package com.chenhao.test.test1;

import java.util.Date;

public class DateConstrueter {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date1);
    }
}
