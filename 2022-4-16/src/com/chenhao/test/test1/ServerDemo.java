package com.chenhao.test.test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10000);
        //建立链接
        Socket accept = s.accept();
        InputStream is = accept.getInputStream();
        int a;
        byte[] b = new byte[1024];
        while ((a = is.read(b)) != -1) {
            System.out.println(new String(b));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你是谁啊");
        bw.newLine();
        bw.flush();

        bw.close();
        is.close();
        s.close();

    }
}
