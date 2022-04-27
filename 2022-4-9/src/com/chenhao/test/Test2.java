package com.chenhao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\黑马\\Download\\资料\\Java59每天完整资料\\day11_IO流01\\资料\\素材\\嘿嘿嘿.avi");
        FileOutputStream fos = new FileOutputStream("d:\\嘿嘿嘿.avi");
        long l = System.currentTimeMillis();
       /* byte[] bytes = new byte[10000];
        int len ;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }*/
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        long l1 = System.currentTimeMillis();
        fis.close();
        fos.close();
        System.out.println(l1-l);

    }
}
