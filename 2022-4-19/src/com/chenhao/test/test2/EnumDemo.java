package com.chenhao.test.test2;

public class EnumDemo {
    public static void main(String[] args) {
        Class<? extends Season> aClass = Season.AUTUMN.getClass();
    }
}
