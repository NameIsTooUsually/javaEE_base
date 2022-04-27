package com.chenhao.apitest.test7;


import java.util.Scanner;

/*
请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，
程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        String score = sc.next();

        int intscore = Integer.parseInt(score)+5;
        System.out.println(intscore);
    }
}
