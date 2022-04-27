package com.chenhao.test.socket;

import java.io.IOException;
import java.net.*;

public class MyServerDemo {
    public static void main(String[] args) throws IOException {
        //创建一个码头
        DatagramSocket ds = new DatagramSocket();
        //打一个包
        //DatagramPacket(byte buf[], int offset, int length,InetAddress address, int port
        String s = "当你看到这句话的时候，你就看了一句话";
        byte[] bytes = s.getBytes();
        InetAddress addredss = InetAddress.getLocalHost();
        System.out.println(addredss.getHostName());
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,addredss,port);

        //发送
        ds.send(dp);
        //关闭资源
        ds.close();
    }
}
