package com.chenhao.test;

import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("杨过","小龙女");
        prop.put("郭靖","黄蓉");
        prop.put("张无忌","赵敏");
        prop.setProperty("张无忌", "周芷若");
        String s = prop.getProperty("杨过");
        System.out.println(s);

        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {

            System.out.println(string+"======"+prop.getProperty(string));
        }


    }

}
