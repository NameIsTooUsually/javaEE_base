package com.chenhao.test;

import java.io.*;
import java.nio.charset.Charset;

public class Test5 {
    public static void main(String[] args) throws IOException {
        //字节输入流转换成字符转换流
        InputStreamReader isp = new InputStreamReader(new FileInputStream("2022-4-10\\aaa.txt"), Charset.forName("utf-8"));
        int read = isp.read();
        System.out.println((char)read);
        isp.close();
        OutputStreamWriter osp = new OutputStreamWriter(new FileOutputStream("2022-4-10\\aaa.txt",true),Charset.forName("utf-8"));
        osp.write("当你看完这句话的时候，你已经看完了一句话");
        osp.close();
    }
}
