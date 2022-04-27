package com.chenhao.apitest.test8;

import java.util.Scanner;

/*
程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
		“积分看电视了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记特朗普”
	请将字符串中所有的”特朗普”替换为”*”符号。

 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评论");
        String comment = sc.next();
        String commentNew = comment.replace("特朗普","***");
        System.out.println(commentNew);
    }
}
