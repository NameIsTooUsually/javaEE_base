package com.chenhao.test.test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        ServerSocket ss = new ServerSocket(10000);
        while(true){
            //等待接收
            Socket accept = ss.accept();
            BufferedInputStream bi = new BufferedInputStream(accept.getInputStream());

            //写入到本地文件中
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                    "2022-4-15\\ServerDir\\"+UUID.randomUUID()+".png"));
            int b;
            while((b = bi.read())!=-1){
                bos.write(b);
            }

            //上传完文件，告诉客户端上传成功
            //创建网络输出流
            BufferedOutputStream bo = new BufferedOutputStream(accept.getOutputStream());
            bo.write("上传成功".getBytes());
            //accept.shutdownOutput();

            //关闭资源
            bo.close();
            bos.close();
            bi.close();
        }
        //ss.close();
    }
}
