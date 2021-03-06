package com.chenhao.day14;

import java.util.Arrays;
import java.util.stream.Stream;

/*
有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
使用Stream将以郭字开头的元素存入新数组。
 */
public class Test4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String[] guos = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);
        System.out.println(Arrays.toString(guos));
    }
}
