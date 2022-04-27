package com.chenhao.day18.Tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
需求：在项目下创建TCP客户端，访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888。
要求：
1. 客户端连接服务器,并发送 hello.服务器,我是客户端.
2. 开启上一题服务器,等待客户端连接,客户端连接并发送数据
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //获取本机地址
        InetAddress name = InetAddress.getByName("鼓包精灵");
        //获取IP地址
        String ip = name.getHostAddress();
        //创建客户端对象
        Socket socket = new Socket(ip,8888);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //发送数据
        outputStream.write("hello.服务器,我是客户端".getBytes());
        //关闭输出流
        socket.shutdownOutput();

        //关闭socket
        socket.close();
    }
}
