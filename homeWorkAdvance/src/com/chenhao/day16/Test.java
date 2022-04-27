package com.chenhao.day16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
需求：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
将多个Student对象存储到一个集合中。输入完毕后，
将所有学员信息存储到文件Student.txt中。
每名学员信息存储一行，多个属性值中间用逗号隔开。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建一个键盘输入对象
        Scanner sc = new Scanner(System.in);
        //创建一个集合用来存储学生对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //创建一个字符输出流，并关联目标文件
        FileWriter fw = new FileWriter("homeWorkAdvance\\src\\com\\chenhao\\day16\\Student.txt");
        //循环输入学生信息
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生姓名");
            String name = sc.next();
            System.out.println("请输入第"+i+"学生年龄");
            int age = sc.nextInt();
            arrayList.add(new Student(name,age));
        }
        for (Student student : arrayList) {
            fw.write(student.toString());
            fw.write("\r\n");
        }
        //刷新
        fw.flush();
        //关闭流
        fw.close();
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name +", age=" + age;
    }
}
