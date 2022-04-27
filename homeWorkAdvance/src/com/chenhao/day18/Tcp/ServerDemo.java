package com.chenhao.day18.Tcp;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求：创建新项目，按以下要求编写代码：
1. 在项目下创建TCP 服务器端 端口号为8888
2. 等待客户端连接，如果有客户端连接则获取到客户端对象
3. 在获取到客户端对象之后 在服务器读取客户端传送的数据
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端的serverSocket对象
        ServerSocket serverSocket = new ServerSocket(8888);
        //等待客户端链接
        Socket socket = serverSocket.accept();
        //获取输入流，并包装成缓冲流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //关闭资源
        bis.close();
        serverSocket.close();
    }
}
