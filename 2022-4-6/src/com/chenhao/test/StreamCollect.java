package com.chenhao.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("张三", "二狗", "狗子", "二狗", "大头", "二狗", "多多", "二狗"));
       /* Map<Character, Character> collect = arr.stream().filter(str -> {
            return str.length() >= 2;
        }).
                collect(Collectors.toMap((String s) -> {
                    return s.charAt(0);
                }, (String s) -> {
                    return s.charAt(1);
                }));
        System.out.println(collect);*/


        Set<String> collect1 = arr.stream().collect(Collectors.toSet());
        List<String> collect2 = arr.stream().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect2);

    }
}

