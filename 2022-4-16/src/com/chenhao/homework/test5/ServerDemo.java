package com.chenhao.homework.test5;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建一个Serversocket对象
        ServerSocket serverSocket = new ServerSocket(19999);
        //获取网络中的socket
        Socket socket = serverSocket.accept();
        //向网络中获取输出流
        OutputStream outputStream = socket.getOutputStream();

        //读取本地文件
        FileInputStream fileInputStream = new FileInputStream("D:\\美女.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while((len=fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,bytes.length);
        }
        //关闭资源
        fileInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
