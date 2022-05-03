package com.chenhao.atom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
假如config.properties文件上有如下信息.
username=zs
password=123
color=red
请使用键盘录入要登陆的用户名和密码.判断是否正确打印登陆成功和登陆失败.
要求:
如果登陆成功要读取该用户的color属性的值.
使用字符流
如果color=red 以红色字体把用户所有信息打印到控制台. // System.err.println(prop);
如果color=black 以黑色字体把用户所有信息打印到控制台. // System.out.println(prop);
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);

        //创建properties对象
        Properties properties = new Properties();
        //加载文件
        properties.load(new FileInputStream("C:\\Develop\\project\\AdvanceCode\\study-test\\prop.properties"));
        while(true){
            // 让用户输入用户名和密码
            System.out.println("请输入用户名");
            String userName = sc.next();
            //让用户输入密码
            System.out.println("请输入密码");
            String passWord = sc.next();

            if(userName.equals(properties.getProperty("username"))&&passWord.equals(properties.getProperty("password"))){
                //用户输入的用户名和值均正确，则登录成功
                //获取颜色属性
                String col = properties.getProperty("color");
                if("red".equals(col)){
                    System.out.println("亲爱的,"+userName+",登录成功，您的信息如下");
                    System.err.println(properties);
                }else if("black".equals(col)){
                    System.out.println("亲爱的,"+userName+",登录成功，您的信息如下");
                    System.out.println(properties);
                }
                //输入用户信息后，结束循环
                break;
            }else{
                System.out.println("登录失败，用户名或密码不对呀！");
            }
        }

    }
}
