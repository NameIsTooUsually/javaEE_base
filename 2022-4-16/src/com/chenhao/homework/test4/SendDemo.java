package com.chenhao.homework.test4;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/*
编写UDP程序
发送端键盘输入内容,输入一行,发送到接收端
如果键盘输入的是 over 就结束发送
接收端接收输入,将接收到的内容转成大写输出到控制台
如果接收到over,就输出程序结束了
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建UDP socket对象
        DatagramSocket ds = null;
            ds = new DatagramSocket();
            //创建IP对象、端口号、数组
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            byte[] bytes;
            while (true) {
                //输入内容
                System.out.println("输入发送的内容");
                String str = sc.next();
                bytes = str.getBytes();
                //创建 packet
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, port);
                //开始发送
                ds.send(dp);
                if ("over".equals(str)) {
                    break;
                }
            }
            ds.close();
    }
}
