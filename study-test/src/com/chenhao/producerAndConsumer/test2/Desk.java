package com.chenhao.producerAndConsumer.test2;
/*
桌子 用来存放汉堡，提供锁对象，进行计数
 */
public class Desk {
     static boolean flag = false;
     static Object lock = new Object();
     static int count = 10;
}
