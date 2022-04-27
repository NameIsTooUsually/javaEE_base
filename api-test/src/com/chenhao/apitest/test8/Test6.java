package com.chenhao.apitest.test8;

import java.util.Scanner;

/*
程序从控制台一次性接收一个学员信息，要求程序必须能正确处理以下几种格式的数据：
		“张三,20,男”
		“   张三   ,     20    ,男”
	编程：
	定义学员类，可以存储上述数据(姓名String，年龄int，性别char)
	定义测试类，创建一个学员对象，从控制台接收一名学员信息，并能正确解析，
并将数据存储到学员对象中，最后打印这个学员对象的所有属性的值。

 */
public class Test6 {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息");
        String message = sc.nextLine();
        if (message.indexOf(" ") != -1) {
            String[] studengMess = message.split("\\s+");
            String temp = studengMess[0].concat(studengMess[1]).concat(studengMess[2]).concat(studengMess[3]).concat(studengMess[4]);
            studengMess = temp.split(",");
            stu.setName(studengMess[0]);
            stu.setAge(Integer.parseInt(studengMess[1]));
            stu.setGender(studengMess[2].charAt(0));
            /*String[] studengMess = message.split(",");
            stu.setName(studengMess[0]);
            stu.setAge(Integer.parseInt(studengMess[1]));
            stu.setGender(studengMess[2].charAt(0));*/
        } else {
            String[] studengMess = message.split(",");
            stu.setName(studengMess[0]);
            stu.setAge(Integer.parseInt(studengMess[1]));
            stu.setGender(studengMess[2].charAt(0));
        }
        System.out.println(stu);
        System.out.println(stu.getName());
    }
}

class Student {
    private String name;
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Student() {
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
