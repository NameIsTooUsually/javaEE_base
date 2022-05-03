package com.chenhao.atom;
/*
1.利用Map，完成下面的功能：
一.从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该 年没有举办
世界杯，则输出：没有举办世界杯。
二、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，输出该球队夺冠的年份列
表。 例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界
杯
 */

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //创建一个map key为年份 值为该年份的冠军
        HashMap<String, String> worldCup = new HashMap<>();
        worldCup.put("1930", "乌拉圭");
        worldCup.put("1934", "意大利");
        worldCup.put("1938", "意大利");
        worldCup.put("1950", "乌拉圭");
        worldCup.put("1954", "西德");
        worldCup.put("1958", "巴西");
        worldCup.put("1962", "巴西");
        worldCup.put("1966", "英格兰");
        worldCup.put("1970", "巴西");
        worldCup.put("1974", "西德");
        worldCup.put("1978", "阿根廷");
        worldCup.put("1982", "意大利");
        worldCup.put("1986", "阿根廷");
        worldCup.put("1990", "西德");
        worldCup.put("1994", "巴西");
        worldCup.put("1998", "法国");
        worldCup.put("2002", "巴西");
        worldCup.put("2006", "意大利");
        worldCup.put("2010", "西班牙");
        worldCup.put("2014", "德国");

       //调用第一题的方法
        method1(worldCup);

        //调用第二题方法
        method2(worldCup);
    }

    private static void method2(HashMap<String, String> worldCup) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);
        //给出提示，输入一个国家名
        System.out.println("请输入国家名");
        String champion = sc.next();

        //创建一个集合用来存储年份
        TreeSet<String> years = new TreeSet<>();
        //先判断是否含有该值，如果没有该值，则说明没有获得过冠军
        boolean isGetChampion = worldCup.containsValue(champion);
        if(!isGetChampion){
            System.out.println("没有获得过世界杯");
            return;
        }else{
            //获取键值对集合
            Set<Map.Entry<String, String>> entries = worldCup.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                //将该年冠军与输入的国家进行比较，如果相等则将该年份存入集合
                boolean result = champion.equals(entry.getValue());
                if(result){
                    years.add(entry.getKey());
                }
            }
        }
        for (String year : years) {
            System.out.print(year+" ");
        }

    }

    private static void method1(HashMap<String, String> worldCup) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);
        //给出提示，输入一个年份
        System.out.println("请输入年份");
        String year = sc.next();

        //判断是否包含year的key
        boolean result = worldCup.containsKey(year);
        if (result) {
            //结果为true 则表示概念举办了世界杯
            //通过key 获取该年的冠军
            String champion = worldCup.get(year);
            //打印
            System.out.println("冠军是：" + champion);
        } else {
            //如果没有该年份，则该年没有举办过世界杯
            System.out.println("没有举办世界杯");
        }
    }
}