package com.chenhao.test.ThreadDemo1;

public class Mythread extends Thread{
    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+"@@@"+i);
        }
    }
}
