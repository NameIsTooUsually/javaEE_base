package com.chenhao.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

       //FileReader fr = new FileReader("2022-4-10\\src\\aaa.properties");
        prop.setProperty("张无忌","周芷若");
        prop.setProperty("杨过","小龙女");
        prop.setProperty("段誉","王语嫣");
        FileWriter fw = new FileWriter("2022-4-10\\src\\aaa.properties");

        prop.store(fw,"xue de bi jiao" );
        fw.close();


    }
}
