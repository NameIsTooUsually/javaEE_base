package com.chenhao.test.countdownlatch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress = localHost.getHostAddress();
        String hostName = localHost.getHostName();
        System.out.println(hostName);
        System.out.println(hostAddress);

    }
}
