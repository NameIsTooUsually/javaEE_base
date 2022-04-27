package com.chenhao.day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
需求：将Test中（序列化流题目1）保存到stu.txt文件中的学生对象读取出来。
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("homeWorkAdvance\\src\\com\\chenhao\\day17\\stu.txt"));
        //读取对象
        Object o = ois.readObject();
       ois.close();
        if(o instanceof Student){
            //判断对象是否是student类型
            Student student = (Student)o;
            System.out.println(student);
        }
    }
}
