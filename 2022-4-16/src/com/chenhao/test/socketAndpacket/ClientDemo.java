package com.chenhao.test.socketAndpacket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

//发送端
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建一个发送端对象，从随机端口发送
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            //创建数据
            String s = sc.next();
            if("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            //创建地址对象
            InetAddress localHost = InetAddress.getLocalHost();
            //端口号
            int port = 10000;
            //创建一个包对象
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,localHost,port);
            //开始发送
            ds.send(dp);
        }

        //关闭发送端对象
        ds.close();

    }
}
