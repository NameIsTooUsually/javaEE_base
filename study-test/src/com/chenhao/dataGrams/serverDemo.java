package com.chenhao.dataGrams;

import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class serverDemo {
    public static void main(String[] args) throws Exception {
        //创建一个udp接收端对象,接收端需要指定接收端口号
        DatagramSocket ds= new DatagramSocket(15535);
        //需要写入本地，创建一个输出流
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\project\\AdvanceCode\\study-Test\\src\\com.chenhao.dataGrams\\aaa.jpg");
        //创建一个接收端的数据包
        //指定接收的容器，以及长度
        byte[] bytes = new byte[2048];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //接收数据
        while(true){
            ds.receive(dp);
            byte[] data = dp.getData();
            if(new String(data,0,data.length).equals("结束了")){
                break;
            }
            fos.write(data);
        }

        fos.close();
        ds.close();
    }
}
