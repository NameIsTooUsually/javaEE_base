package com.chenhao.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
要求
使用字节缓冲/字节流，将一个路径下的视频复制到另一路径下
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        //创建一个输入流对象
        FileInputStream fis = new FileInputStream("C:\\黑马\\Download\\资料\\" +
                "Java59每天完整资料\\day11_IO流01\\资料\\素材\\嘿嘿嘿.avi");
        //创建一个输出流对象
        FileOutputStream fos = new FileOutputStream("嘿嘿嘿.avi");

        long l = System.currentTimeMillis();
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }

}
