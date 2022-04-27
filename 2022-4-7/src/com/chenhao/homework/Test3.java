package com.chenhao.homework;

import java.io.File;

/*
- 请在D盘根目录下创建一个文件：test1.txt(随意录入一些内容)，再创建一个目录：测试目录
- 请编写main()方法，创建以下两个File对象：
  - File file1 = new File(“d:\\test1.txt”;
  - File file2 = new File(“d:\\测试目录”);
- 要求：
  1. 获取、打印file1和file2的绝对路径；
  2. 获取、打印file1和file2的文件名和目录名；
  3. 获取、打印file1和file2的文件大小；
  4. 分别判断file1和file2是否存在；
  5. 分别判断file1和file2是否是文件？是否是目录？
 */
public class Test3 {
    public static void main(String[] args) {
        File file1 = new File("d:\\test1.txt");
        File file2 = new File("d:\\测试目录");
        //获取、打印file1和file2的绝对路径；
        System.out.println("file1的绝对路径" + file1.getAbsolutePath());
        System.out.println("file2的绝对路径" + file2.getAbsolutePath());
        System.out.println("==============================");
        //获取、打印file1和file2的文件大小；
        System.out.println("file1的大小" + file1.length());
        System.out.println("file2的大小" +getFilesSize(file2));

        System.out.println("=============================");
        //分别判断file1和file2是否存在
        if (file1.exists()) {
            System.out.println("file1存在");
        } else {
            System.out.println("file1不存在");
        }

        if (file2.exists()) {
            System.out.println("file2存在");
        } else {
            System.out.println("file2不存在");
        }
        System.out.println("============================");
        //分别判断file1和file2是否是文件？是否是目录？
        if (file1.isFile()) {
            System.out.println("file1是文件");
        } else if(file1.isDirectory()){
            System.out.println("file1是目录");
        }else{
            System.out.println("file1啥也不是");
        }

        if (file2.isFile()) {
            System.out.println("file2是文件");
        } else if(file2.isDirectory()){
            System.out.println("file2是目录");
        }else{
            System.out.println("file2啥也不是");
        }
    }
    //获取文件夹大小，递归思想，假设该方法已经实现就是获取文件夹的大小的
    //如果需要获取文件夹大小，则需要先获取下一层文佳夹中的文件和文件夹大小，对于文件大小可以直接用。length计算
    //其中的文件夹大小再调用该方法。
    //在方法中，首先获取文件对象中的每一个元素，判断元素是否为文件，如果为文件将其大小累加，
    //对文件夹调用该方法，对方法的返回值累加。
    //最后返回的就是该文件夹的大小
    public static long getFilesSize(File file){
        //定义一个统计文件夹大小的变量
        long count = 0;

        //获取文件夹中的内容

        File[] filesArr = file.listFiles();
        //对文件中的元素进行遍历，如果是文件则直接计算它的大小
        for (File file1 : filesArr) {
            if(file1.isFile()){
                count += file1.length();
            }else{
                count = count+getFilesSize(file1);
            }
        }
        //System.out.println(count);
        return count;
    }

}
