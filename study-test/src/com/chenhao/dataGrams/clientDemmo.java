package com.chenhao.dataGrams;

import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class clientDemmo {
    public static void main(String[] args) throws Exception {
        //1、创建一个udp发送端的对象
        DatagramSocket ds = new DatagramSocket();
        //2创建一个数据包，存储数据
        //数据包中需要接收端的IP、端口、以及需要发送的数据
        //IP
        InetAddress ip = InetAddress.getByName("鼓包精灵");
        //端口
        int port = 15535;
        //数据
        FileInputStream fis = new FileInputStream("C:\\Develop\\project\\AdvanceCode\\study-Test\\src\\com.chenhao.dataGrams\\123.jpg");
        byte[] bytes = new byte[2048];
        int len;
        while((len=fis.read(bytes))!=-1){
            //打包
            DatagramPacket dp = new DatagramPacket(bytes,len, ip, port);
            ds.send(dp);
        }
        //打包
        String str = "结束了";
        bytes=str.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, port);
        ds.send(dp);

        //关流
        fis.close();
        ds.close();


    }
}
