package com.chenhao.test.test2;

import sun.nio.cs.ext.GBK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream ips = systemClassLoader.getResourceAsStream("prop.properties" );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ips, "gbk"));
        String s = bufferedReader.readLine();
        Properties properties = new Properties();
        properties.load(bufferedReader);
        System.out.println(properties);
        //System.out.println(s);

    }
}
