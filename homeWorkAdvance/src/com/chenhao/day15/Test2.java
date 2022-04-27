package com.chenhao.day15;

import java.io.File;

//需求：计算指定文件夹中所有文件和子文件总的大小。
public class Test2 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\ddd");
            long size = getFileSize(file);
            System.out.println("该文件大小："+size);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static long getFileSize(File file) {
        if(!file.exists()){
            //如果文件或文件夹不存在则直接抛出异常
            throw new RuntimeException("文件不存在");
        }
        //创建一个统计文件大小的变量
        long size = 0;
        if(file.isFile()){
            return file.length();
        }
        //获取该文件夹中所有的文件和文件夹
        File[] files = file.listFiles();

        for (File file1 : files) {
            //遍历数组，如果这个元素是文件则计算它的大小
            if(file.isFile()){
                size+=file.length();
            }else{
                size+=getFileSize(file1);
            }
        }

        return size;
    }
}
