package com.chenhao.homework.test4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端Udp  socket对象并指定端口
        DatagramSocket ds = new DatagramSocket(10086);
        //创建接收端packet
        //创建数组接收
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            //开始接收
            ds.receive(dp);
            byte[] data = dp.getData();
            int len = dp.getLength();
            String str = new String(data, 0, len);
            if ("over".equals(str)) {
                System.out.println("程序结束了");
                break;
            } else {
                System.out.println(str);
            }
        }

    }
            }
