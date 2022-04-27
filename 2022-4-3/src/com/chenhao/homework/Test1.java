package com.chenhao.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
请按以下要求顺序编码：
Ø  定义一个：键Integer，值String类型的HashMap集合
Ø  存储以下数据：
1，”张三”
2，“李四”
1，“王五”
Ø  打印集合大小；
Ø  使用“键找值”的方式遍历集合，打印键和值；
Ø  使用“键值对”的方式遍历集合，打印键和值；
Ø  获取键为1的值，并打印
Ø  获取键为10的值，并打印
Ø  判断集合中是否有键：10
Ø  删除键为1的键值对，删除完毕打印集合
 */
public class Test1 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Integer,String> hashMap = new HashMap<>();
        //通过集合对象添加元素
        hashMap.put(1,"张三");
        hashMap.put(2,"李四");
        hashMap.put(1,"王五");
        //打印集合大小；
        int hashMapSize = hashMap.size();
        System.out.println("集合大小为："+hashMapSize);
        
        System.out.println("================================");
        
        //使用“键找值”的方式遍历集合，打印键和值；
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            String value = hashMap.get(key);
            System.out.println(key+"-------------"+value);
        }

        System.out.println("================================");

        //使用“键值对”的方式遍历集合，打印键和值；
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-------------"+value);
        }

        System.out.println("================================");

        //获取键为1的值，并打印
        String s = hashMap.get(1);
        System.out.println("键为1的值为："+s);

        System.out.println("================================");

        //获取键为10的值，并打印
        String s1 = hashMap.get(10);
        System.out.println("键为10的值为："+s1);

        System.out.println("================================");

        //判断集合中是否有键：10
        boolean isExists = hashMap.containsKey(10);
        System.out.println("集合中是否存键 10："+isExists);

        System.out.println("================================");

        //删除键为1的键值对，删除完毕打印集合
        System.out.println("删除前"+hashMap);
        hashMap.remove(1);
        System.out.println("删除后"+hashMap);

    }
}
