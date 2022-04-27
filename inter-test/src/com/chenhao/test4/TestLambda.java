package com.chenhao.test4;

import java.util.Scanner;

public class TestLambda {
    public static void main(String[] args) {
       /* getOuter(new Outer() {
            @Override
            public void eat() {
                System.out.println("晚上吃的是黄瓜和大白菜");
            }
        });*/

        getOuter(( a, b, c) -> {
            int temp = 0;
            switch (c) {
                case "1":
                    temp = a + b;
                    break;
                case "2":
                    temp = a - b;
                    break;
                case "3":
                    temp = a * b;
                    break;
                case "4":
                    temp = a / b;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
            return temp;
        });
    }

    public static void getOuter(Outer outer) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请选择 1+ ；2- ；3* ；4/");
        String c = sc.next();
        int result = outer.sum(a, b, c);
        System.out.println(result);
    }
}

interface Outer {
    int sum(int a, int b, String c);
}
