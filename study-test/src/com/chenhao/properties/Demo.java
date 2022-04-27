package com.chenhao.properties;

import java.io.*;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {
       /* ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties properties = new Properties();
        properties.load(is);*/

        //Class.forName(properties.getProperty("name"))
       /* ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream ips = systemClassLoader.getResourceAsStream("prop.properties" );
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ips, "gbk"));
        String s = bufferedReader.readLine();
        Properties properties = new Properties();
        properties.load(bufferedReader);
        System.out.println(properties);*/
        Properties properties = new Properties();
        properties.put("name","张三");
        properties.put("id","007");
        FileOutputStream fo = new FileOutputStream("prop.properties");
        FileWriter fw = new FileWriter("prop.properties");
        properties.store(fw,"gbk");
        fw.close();
    }
}
