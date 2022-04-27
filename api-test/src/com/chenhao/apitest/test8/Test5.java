package com.chenhao.apitest.test8;

import java.util.Scanner;

/*
程序从控制台接收一个java文件的文件名，例如：test.java，TEST.java，tEst.JAVA，请编程实现以下功能：
	获取，并打印文件名的第一个字符；
	获取，并打印文件的后缀名(包括.符号)，例如：.java
	无论原文件名什么样，最终将其转换为：Test.java的形式，打印转换后的文件名。

 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入一个带后缀的文件名");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        char first = fileName.charAt(0);
        System.out.println("first:"+first);

        int index = fileName.indexOf('.');
        String fileFormat = fileName.substring(index);
        System.out.println("文件格式"+fileFormat);

        //首字母大写
        String bigFirst = String.valueOf(fileName.charAt(0)).toUpperCase();
        //后面的小写
        String nextFile = fileName.substring(1).toLowerCase();
        System.out.println(bigFirst+nextFile);

    }
}
