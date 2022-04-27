package com.chenhao.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String uesrName = sc.next();
        System.out.println("请输入密码");
        String passWard = sc.next();
        FileWriter fw = new FileWriter("2022-4-9\\b.txt");

        fw.write("用户名："+uesrName+"\r\n");
        fw.write("密码："+passWard+"\r\n");
        fw.close();
    }
}
