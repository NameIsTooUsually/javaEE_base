package com.chenhao.test;

import java.util.*;
import java.util.stream.Stream;

public class MyStreamTest {
    public static void main(String[] args) {
        //单列集合上流操作
        ArrayList<String> arr = new ArrayList<>(List.of("aaa", "bbbb", "cccc", "dd", "abcd"));
        arr.stream().filter((String s) -> {
            return s.length() >= 3;
        }).forEach(s -> System.out.println(s));
        System.out.println("================");
        //双列集合上流操作
        HashMap<String, Integer> hm = new HashMap<>(Map.of("张三", 23, "李素", 35, "王五", 40));
        hm.keySet().stream().filter(s -> {
            return hm.get(s) > 25;
        }).forEach(s -> System.out.println(s));
        System.out.println("===============");
        //数组上流操作
        int[] ar = {1, 2, 3, 4, 5, 5, 6};
        Arrays.stream(ar).forEach(i -> System.out.println(i));
        System.out.println("+================+");
        //相同数据上流
        Stream.of("a", "b", "c", "d").forEach(s -> System.out.println(s));

        HashMap<String, String> hhhh = new HashMap<>(Map.ofEntries(Map.entry("张三","27"), Map.entry("狗子","29")));
        hhhh.entrySet().stream().filter(entryy->{
            return Integer.parseInt(entryy.getValue())>28;
        }).forEach(entry-> System.out.println(entry));
    }
}
