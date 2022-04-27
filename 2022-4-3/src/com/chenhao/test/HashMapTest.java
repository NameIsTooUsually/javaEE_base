package com.chenhao.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Student2,String> map = new HashMap<>();
        Student2 stu1 = new Student2("刘亦菲",35);
        Student2 stu2 = new Student2("张柏芝",33);
        Student2 stu3 = new Student2("高圆圆",36);
        Student2 stu4 = new Student2("刘亦菲",35);

        map.put(stu1,"安徽");
        map.put(stu2,"湖北");
        map.put(stu3,"江西");
        map.put(stu4,"安徽");

        /*map.put("5111","一");
        map.put("4222","二");
        map.put("5333","三");
        map.put("2444","四");
        map.put("1555", "五");*/

        map.forEach((Student2 key ,String value)->{
            System.out.println(key+"======="+value);
        });


        /*Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key+"======="+value);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+"========"+value);
        }*/

        /*String result = map.put("1111", "牛逼的狗");
        System.out.println(map);
        System.out.println(result);*/

        /*map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());*/

        /*System.out.println(map.containsKey("777"));
        System.out.println(map.containsValue("二狗"));*/

       /* System.out.println(map.remove("2222"));
        System.out.println(map);*/

    }
}
