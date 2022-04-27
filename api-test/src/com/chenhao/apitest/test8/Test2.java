package com.chenhao.apitest.test8;

import java.util.Scanner;

/*
请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
	判断此文件名是否以“.java”结尾，并打印结果
	获取此文件中.符号的索引位置，并打印结果

 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入java文件名");
        String javaFileName = sc.next();
        if (javaFileName.endsWith(".java")) {
            System.out.println("是java文件");

            int index = javaFileName.indexOf(".");
            System.out.println("符号。的索引是"+index);
        } else {
            System.out.println("不是java文件");
        }


    }
}
