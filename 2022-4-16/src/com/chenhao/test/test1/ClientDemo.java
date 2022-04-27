package com.chenhao.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("你好啊狗子".getBytes());
        socket.shutdownOutput();
        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while((str=bf.readLine())!=null){
            System.out.println(str);
        }
        bf.close();
        os.close();
        socket.close();
    }
}
