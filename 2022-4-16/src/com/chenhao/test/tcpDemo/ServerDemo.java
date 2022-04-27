package com.chenhao.test.tcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器接收端对象
        ServerSocket s = new ServerSocket(10000);
        //等待发送端发送
        Socket accept = s.accept();
        //创建输入流对象
        InputStream is = accept.getInputStream();
        //解析
        int b;
        byte[] bytes = new byte[1024];
        while ((b = is.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }
        is.close();
        s.close();

    }
}
