package com.chenhao.test.test3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        Socket s = new Socket("127.0.0.1", 10000);
        //获取本体文件
        BufferedInputStream bs = new BufferedInputStream(new FileInputStream("2022-4-15\\ClientDir\\分析.png"));
        //创建服务器输出流
        BufferedOutputStream bf = new BufferedOutputStream(s.getOutputStream());
        int b;
        while ((b = bs.read()) != -1) {
            bf.write(b);
        }
        s.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println((str));
        }

        br.close();
        //bf.close();
        bs.close();
        s.close();

    }
}
