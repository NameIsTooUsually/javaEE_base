package com.chenhao.homework;

import java.io.File;

/*
- 请在D盘下创建一个目录“多级目录”，下面随意创建一些文件和目录。
- 请编写main()方法，创建以下File对象：
- File file = new File(“D:\\多级目录”);
- 要求：
  1. 获取这个file目录下所有的子文件/子目录的File数组
  2. 遍历这个数组，判断每个File对象是否文件
     如果是文件，打印：【文件】+ 绝对路径
     如果是目录，打印：【目录】+ 绝对路径
 */
public class Test5 {
    public static void main(String[] args) {
        //创建对象
        File file = new File("D:\\多级目录");
        File[] fileArr = file.listFiles();
        for (File file1 : fileArr) {
            if(file1.isFile()){
                System.out.println(file1.getName()+"\t"+file1.getAbsolutePath());
            }else if(file1.isDirectory()){
                System.out.println(file1.getName()+"\t"+file1.getAbsolutePath());
            }else{
                System.out.println(file1.getName()+"+啥也不是");
            }
        }
    }
}
