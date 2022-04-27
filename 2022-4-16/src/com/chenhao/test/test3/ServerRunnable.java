package com.chenhao.test.test3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class ServerRunnable implements Runnable{
        private Socket accept;
    public ServerRunnable(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos= null;
        try {
            BufferedInputStream bi = new BufferedInputStream(accept.getInputStream());

            //写入到本地文件中
            bos = new BufferedOutputStream(new FileOutputStream(
                    "2022-4-15\\ServerDir\\"+UUID.randomUUID()+".png"));
            int b;
            byte[] bytes = new byte[1024];
            while((b = bi.read(bytes))!=-1){
                bos.write(bytes);
            }

            //上传完文件，告诉客户端上传成功
            //创建网络输出流
            BufferedOutputStream bo = new BufferedOutputStream(accept.getOutputStream());
            bo.write("上传成功".getBytes());
            //accept.shutdownOutput();

            //关闭资源
            bo.close();
            bos.close();
            bi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
