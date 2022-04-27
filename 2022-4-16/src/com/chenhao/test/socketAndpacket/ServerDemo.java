package com.chenhao.test.socketAndpacket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端对象,并指定端口号
        DatagramSocket ds = new DatagramSocket(10000);
        //创建一个数组，用于接收数据
        byte[] bytes = new byte[1024];
        while (true) {
            //创建数据包
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            //开始接收
            ds.receive(dp);
            int length = dp.getLength();
            byte[] data = dp.getData();
            System.out.println(new String(data,0,length));
        }
    }
}
