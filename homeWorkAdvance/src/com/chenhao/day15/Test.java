package com.chenhao.day15;

import java.io.File;
import java.io.IOException;

/*
需求: 编写程序，根据传入的文件路径字符串
（如果这个路径表示的文件实际不存在，则创建文件），
输出这个文件的文件名、绝对路径名、父目录、文件大小、后缀名。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\又是一个文件夹\\文件夹\\刘亦菲.jpg");
        //先判断文件夹是否存在
        File file1 = new File("D:\\又是一个文件夹\\文件夹");
        if(!file1.exists()){
            file1.mkdirs();
        }
        //判断文件是存在，如果不存在就创建
        if(!file.exists()){
            file.createNewFile();
        }
        //获取文件名
        System.out.println("文件名："+file.getName());
        //获取绝对路径
        System.out.println("绝对路径:"+file.getAbsolutePath());
        //获取父目录
        System.out.println("父目录:"+file.getParent());
        //获取文件大小
        System.out.println("文件大小："+file.length());
        //获取后缀名  将文件名的字符串跟你.分割
        String[] name = file.getName().split("\\.");
        System.out.println("后缀名："+name[name.length-1]);
    }
}
