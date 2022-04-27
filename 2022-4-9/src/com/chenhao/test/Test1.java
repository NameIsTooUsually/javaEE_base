package com.chenhao.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("D:\\测试目录\\aaa.txt");
        fis.read();
        byte[] bytes = fis.readAllBytes();
        fis.close();
        for (byte aByte : bytes) {
            System.out.println((char)aByte);
        }


    }
}
