package com.chenhao.pdd2.entry;

import com.chenhao.pdd2.controller.PddController;

import java.util.Scanner;

public class PddEntry {
    public static void main(String[] args) {
        PddController pddController = new PddController();
        System.out.println("头铁的用户你好，欢迎来到就是不信邪活动");
        System.out.println("欢迎来到我们的良心砍价活动");
        System.out.println("1、进行活动 2、只进行一次活动");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        loop:
        while (true) {
            switch (choice) {
                case "1":

                    pddController.Start();
                    //砍价
                    break loop;
                case "2":
                    pddController.Start();
                    //砍价
                    break loop;
                case "100":

                    System.out.println("这都能让你找到，我们一定会再见面的！！！1");
                    break loop;
                default:
                    System.out.println("您的输入错误，请重新输入");
            }
        }

    }
}
