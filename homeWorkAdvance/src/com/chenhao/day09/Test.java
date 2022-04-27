package com.chenhao.day09;

import java.util.HashMap;
import java.util.Scanner;

/*
需求：键盘录入一个字符串,分别统计出其中
英文字母、空格、数字和其它字符的数量,
输出结果:”其他=1, 空格=2, 字母=12,数字=6”
 */
public class Test {
    public static void main(String[] args) {
        //创建一个键盘录入对象
        Scanner sc= new Scanner(System.in);
        //提示输入一个字符串
        System.out.println("请输入一个字符串");
        //接收键盘录入的字符串
        String str = sc.nextLine();
        //创建一个HashMap
        HashMap<String,Integer> map = new HashMap<>();
        //获取该字符串的每一个字符的数组
        char[] chars = str.toCharArray();
        //对数组进行遍历
        for (int i = 0; i < chars.length; i++) {
            //判断字符是否是一个空格
            if((32==chars[i])){
               addChar(map,"空格");
                //判断这个字符是否是一个字母
            }else if((chars[i]>=65&&chars[i]<=90)||(chars[i]>=97&&chars[i]<=122)){
                addChar(map,"字母");
                //判断这个字符是否是一个数字
            }else if(chars[i]>=48&&chars[i]<=57){
                addChar(map,"数字");
                //如果都不匹配则为其他
            }else{
                addChar(map,"其他");
            }
        }
        System.out.println(map);
    }
    //将方法中重复出现的内容抽取出来
    public static void addChar(HashMap<String,Integer> map,String key){
        if( map.containsKey(key)){
            //如果这个符号已经出现过，则将它的值加1
            Integer count = map.get(key);
            count++;
            map.put(key,count);
        }else{
            //如果这个符号没有出现过，则将符号，和值为1最进去
            map.put(key,1);
        }
    }
}
