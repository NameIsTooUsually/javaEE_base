package com.chenhao.test;


public class GenericClassTest {
    public static void main(String[] args) {

        //创建对象
        ArrBox<Integer> a1 = new ArrBox<>();
        //通过对象调用方法，生成数组
        Integer[] arr1 = a1.getArr();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

//定义一个类，类里面有一个创建一个数组的方法
class ArrBox<E> {
    public ArrBox() {
    }

    public E[] getArr() {
        return (E[])new Object[10];
    }
}
