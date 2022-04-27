package com.chenhao.exceptontest.test1;

import java.util.Scanner;

public class ThrowDemo1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的年龄");
            String str = sc.next();
            int i = Integer.parseInt(str);
            System.out.println(i);
            System.out.println(2/0);
        } catch (NumberFormatException e) {
            System.out.println("如果显示的是我，那说明数字转换异常出现了");
        }finally{
            System.out.println("如果显示我了，那我也不知道出现了什么异常");
        }

    }
}
