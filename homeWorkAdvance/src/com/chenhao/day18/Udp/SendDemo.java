package com.chenhao.day18.Udp;

import java.io.IOException;
import java.net.*;

/*
需求：编写程序，使用UDP协议的发送端给接收端发送一句话：“服务端你好啊！”；
然后接收端给发送端返回一句话，内容随意。
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端udp对象
        DatagramSocket socket = new DatagramSocket(19998);
        //创建数据的数组
        byte[] bytes ="服务端你好啊！".getBytes();
        //创建本机IP对象
        InetAddress ip = InetAddress.getByName("鼓包精灵");
        //创建数据包
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,ip,19999);
        //传输数据
        socket.send(packet);

        //接收数据，并打印输出
        socket.receive(packet);
        System.out.println("接收的数据："+new String(packet.getData(),0,packet.getLength()));
        //关闭资源
        socket.close();
    }
}
