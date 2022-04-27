package com.chenhao.test.test3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        ServerSocket ss = new ServerSocket(10086);
        //创建一个线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,5,60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while(true){
            //等待接收,accept放在循环里面可以起到阻塞作用
            Socket accept = ss.accept();
            //如果收到客户端请求，则启动一个任务
            ServerRunnable sr = new ServerRunnable(accept);
            pool.submit(sr);
        }
        //ss.close();
    }
}
