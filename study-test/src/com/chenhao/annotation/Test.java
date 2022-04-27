package com.chenhao.annotation;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("张三","26");
        hashMap.put("狗蛋","26");
        hashMap.put("二狗","26");
        hashMap.put("呆子","26");
        hashMap.put("牛逼","26");
        hashMap.forEach((String s1,String s2)->{
            System.out.println(s1+"========"+s2);
        });

    }
}
