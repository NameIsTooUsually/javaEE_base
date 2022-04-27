package com.chenhao.day18.Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/*
需求：编写程序，使用UDP协议的发送端给接收端发送一句话：“服务端你好啊！”；
然后接收端给发送端返回一句话，内容随意。
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端udp对象
        DatagramSocket socket = new DatagramSocket(19999);
        //创建一个接收数据的数组
        byte[] bytes = new byte[1024];
        //创建一个接收包
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //接收发送端发送的数据
        socket.receive(packet);
        //获取数据
        System.out.println("接收的数据:" + new String(packet.getData(), 0, packet.getLength()));
        //向发送端发送数据
        byte[] bytes1 = "我收到了发送端".getBytes();
        socket.send(new DatagramPacket(bytes1, bytes1.length, InetAddress.getByName("鼓包精灵"), 19998));
        socket.close();
    }
}
