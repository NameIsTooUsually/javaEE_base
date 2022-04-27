package com.chenhao.homework.test5;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress name = InetAddress.getByName("鼓包精灵");
        //InetAddress name = InetAddress.getByName("127.0.0.1");
        String hostAddress = name.getHostAddress();
        System.out.println(hostAddress);
    }
}
