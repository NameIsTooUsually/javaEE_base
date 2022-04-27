package com.chenhao.homework.test2;

import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
(1) 写一个Properties格式的配置文件，配置文件内容如下：
 className=com.itcast.test05.DemoClass
(2)写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
(3)用反射的方式运行run方法
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取prop文件的流。
       /* ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");*/
        //创建properties对象
        Properties prop = new Properties();
        FileReader fw = new FileReader("C:\\Develop\\project\\AdvanceCode\\2022-4-19\\src\\prop.properties");
        prop.load(fw);
        // prop.load(is);
        String className = prop.getProperty("className");
        // System.out.println(className);
        //获取类的字节码文件对象
        Class<?> aClass = Class.forName(prop.getProperty("className"));
        //获取method对象
        Method run = aClass.getDeclaredMethod("run");
        //获取类对象
        Object o = aClass.newInstance();
//运行方法
        run.invoke(o);
    }
}
