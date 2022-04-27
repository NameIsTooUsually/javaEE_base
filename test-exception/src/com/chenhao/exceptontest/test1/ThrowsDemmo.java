package com.chenhao.exceptontest.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemmo {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
    }
    public static void method1() throws NullPointerException,ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void method2() throws ParseException {
        String str = "2022年3月29日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date parse = simpleDateFormat.parse(str);

        System.out.println(parse);
    }
}
