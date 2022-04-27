package com.chenhao.test;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("D:\\音乐\\短发(Live)-张靓颖-57594961.flac"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\短发(Live)-张靓颖-57594961.flac"));
        long l = System.currentTimeMillis();
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
