package com.chenhao.test.tcpDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    //创建socket对象
    public static void main(String[] args) throws IOException {
        Socket socket  = new Socket("127.0.0.1",10000);

        //创建输出流对象
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好啊狗子".getBytes());

        //释放资源
        outputStream.close();
        socket.close();
    }
}
