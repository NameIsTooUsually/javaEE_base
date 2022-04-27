package com.chenhao.test.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyClientDemo {
    public static void main(String[] args) throws IOException {
        //创建一个码头
        DatagramSocket ds = new DatagramSocket(10000);
        //创建一个包存储数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,0,1024);
        //dp.setData(new byte[3]);
        //接收数据
        ds.receive(dp);
        //从盒子里面拿出数据
        byte[] data = dp.getData();
        System.out.println(new String(data));
        System.out.println();
    }
}
