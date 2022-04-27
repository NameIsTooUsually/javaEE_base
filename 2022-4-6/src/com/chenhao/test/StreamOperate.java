package com.chenhao.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperate {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("张无忌","谢广坤","张三丰","张翠山","张麻子","谢广坤","溜达狗蛋","谢广坤","谢广坤"));
        ArrayList<String> arr1 = new ArrayList<>(List.of("二小","小狗","丹丹","靓仔"));

        arr.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("========================");

        arr.stream().skip(3).forEach(s-> System.out.println(s));
        System.out.println("========================");

        arr.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("++++++++++++++++++++++++++");

        Stream.concat(arr.stream(),arr1.stream()).forEach(s -> System.out.println(s));
    }
}
