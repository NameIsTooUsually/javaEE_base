package com.chenhao.test;

import java.util.*;

public class VariableParameterOfMap {
    public static void main(String[] args) {
        HashMap<String ,Integer > hm = new HashMap<>(Map.ofEntries(Map.entry("张三",25), Map.entry("李四",44), Map.entry("王五",36)));
        System.out.println(hm);
        Set<String> keySet = hm.keySet();
        for (String s : keySet) {
            System.out.println(hm.get(s));
        }
        System.out.println("=================");
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.forEach(entry ->{
            System.out.println(entry.getKey()+"==========="+entry.getValue());
        });

    }
}
