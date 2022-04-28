package com.chenhao.day09;

import java.util.HashMap;
import java.util.Scanner;

/*
1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
2.如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
 */
public class Test2 {
    public static void main(String[] args) {
        //创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建对象接收键盘录入的结果
        String str = sc.nextLine();
        //获取键盘录入的的字符串的每一个字符
        char[] chars = str.toCharArray();
        //需要输出字符和出现的次数两个量，所有用map进行存储
        HashMap<Character,Integer> map = new HashMap<>();
        //对数组进行遍历
        for (char aChar : chars) {
            //通过字符来获取值，
            Integer integer = map.get(aChar);
            if(null == integer){
                //如果返回值为null，则该字符没有出现过,将该字符为键，值为1，存入集合中
                map.put(aChar,1);
            }else{
                //如果返回的值不为null，则将该字符为键，该值加一存入集合中
                map.put(aChar,integer+1);
            }
        }
        //遍历输出
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
