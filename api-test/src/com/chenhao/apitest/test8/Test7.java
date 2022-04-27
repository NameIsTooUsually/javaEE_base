package com.chenhao.apitest.test8;

import java.util.Objects;

public class Test7 {
    public static void main(String[] args) {


        Integer i1 = 100;
        //   对象      = 默认是一个基本数据类型

        //jdk1.5的特性 --- 自动装箱

        //装箱: 把一个基本数据类型 变为  对应的包装类的对象.
        //自动: Java底层会帮我们自动的调用valueof方法帮我们完成自动装箱.
        System.out.println(i1);

        //jdk1.5的特性 --- 自动拆箱
        //拆箱: 把一个包装类型的对象 变成 对应的基本数据类型数据
        int i2 = i1;
        System.out.println(i2);

        Integer i3 = 100; //自动装箱机制
        i3 += 200;//i3 = i3 + 200;
        //会把i3这个对象变成基本数据类型100.
        //100 + 200 = 300
        //把基本数据类型300再次自动装箱变成Integer对象赋值给i3
        System.out.println(i3);


        //细节:
        Integer i4 = null;
        if (i4 != null) {
            i4 += 200;
            System.out.println(i4);
        }
    }

}

