package com.chenhao.exceptontest.test1.homework;


import java.util.Scanner;

/*
请定义main()方法，在main()中按以下顺序要求编写代码：
1. 分别从控制台接收两个整数
2. 计算“第一个数 / 第二个数”的结果，并打印；
3. 为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        System.out.println("第一个数");
        int num1 = sc.nextInt();
        int num2;
        while (true) {
            try {
                System.out.println("第二个数");
                num2 = sc.nextInt();
                if (0 == num2) {
                    throw new RuntimeException();
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("第二个数不能为0！！");
            }
        }
        System.out.println("result："+num1*1.0/num2);

    }


}
