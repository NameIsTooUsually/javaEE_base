package com.chenhao.homework;

import java.io.File;
import java.io.IOException;

/*
定义测试类，在测试类中定义main()方法，按以下要求编写代码：
- 构造一个File对象，指向项目根目录下的demo03.txt（此文件不存在）；
- 判断，如果文件不存在，就创建这个文件，打印创建结果；
- 判断这个File对象是否是一个文件，打印结果；
- 判断这个File对象是否是一个目录，打印结果；
- 删除这个文件
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //构造File对象，指向项目根目录下的demo03.txt;
       File file = new File("demo03.txt");
       //判断文件是否存在，需要通过对象创建文件
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }
        //判断这个file对象时否是一个文件
        if(file.isFile()){
            System.out.println("该对象是一个文件");
        }else{
            System.out.println("该对象不是一个文件");
        }
        //判断这个file对象时否是一个目录
        if(file.isDirectory()){
            System.out.println("该对象是一个目录");
        }else{
            System.out.println("该对象不是一个目录");
        }
        //删除这个文件
        System.out.println(file.delete());


    }
}
