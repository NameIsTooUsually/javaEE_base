package com.chenhao.test6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        method(new Outer() {
            @Override
            public String eatApple() {
                System.out.println("需要吃" + a + "个苹果");
                return "这个是匿名内部类的返回值";
            }
        }, a);

        method(() -> {System.out.println("需要吃" + "个苹果");
                        return "这个是Lambda表达式的返回值";}, a);

    }

    public static void method(Outer out, int a) {
        String result = out.eatApple();
        System.out.println("只是想增加一个参数"+a);
        System.out.println(result);
        System.out.println("-------------------");
    }
}

interface Outer {
    public abstract String eatApple();
}
