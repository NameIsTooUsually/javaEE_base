package tcpSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemoForEach {
    public static void main(String[] args) throws IOException {
        //创建一个服务器的接收流
        ServerSocket serverSocket = new ServerSocket(10088);
        //创建一个线程池
        //ExecutorService pool = Executors.newFixedThreadPool(3);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                60,
                TimeUnit.SECONDS,
               new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );


        while(true){
            //在循环中获取socket对象，accept有阻塞作用，如果没有获取到就会一直在这等待
            Socket socket = serverSocket.accept();
            //创建线程处理
            RunnableDemo runnableDemo = new RunnableDemo(socket);
            pool.submit(runnableDemo);
        }
    }
}
