package com.chenhao.homework;

import java.io.*;

/*
请将D:盘下的一个文件复制到E:盘下，例如：d:\\视频.avi，复制到E:\\视频.avi。
​		请使用“字节缓冲流”：BufferedInputStream和BufferedOutputStream实现
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流对象
        //选取D盘的音乐文件，创建缓冲字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\短发-张靓颖.flac"));
        //创建缓冲字节输出流，将文件复制到项目目录下
        BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("2022-4-9\\短发-张靓颖.flac")));

        //读取目标文件
        byte[] bytes = bis.readAllBytes();
        //写入目标文件
        bos.write(bytes);

       //读取目标文件并写入
       /* int len;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes))>-1){
            bos.write(bytes,0,len);
        }*/
        //释放资源
        bis.close();
        bos.close();
    }
}
