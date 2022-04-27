package com.chenhao.homework.test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*
+ TCP文件下载
  客户端从服务器端下载图片
  服务器将文件以流的形式写给客户端
  客户端从服务器读取文件,并保存到c:\download目录下
  保存成功后,控制台打印出下载完成

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
    //创建一个socket对象
        Socket socket = new Socket("127.0.0.1",19999);
        //从网络中接收图片，所以创建输入流
        InputStream inputStream = socket.getInputStream();

        //将文件写到本地，输出流
        FileOutputStream fileOutputStream = new FileOutputStream("2022-4-16\\123.jpg");
        byte[] bytes= new byte[1024];
        int len;

        while((len = inputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        System.out.println("下载完成=---");
        fileOutputStream.close();
        socket.close();
    }

}
