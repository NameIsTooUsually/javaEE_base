package com.chenhao.apitest.test7;

import java.util.Scanner;

/*
	请定义学员类，有以下成员属性：
		姓名：String类型
		年龄：int
		身高：double
		婚否：boolean
		性别：char
	请从控制台接收以下数据：
		姓名：王哈哈
		年龄：24
		身高：1.82
		婚否：false
		性别：男
		以上数据要求全部使用String类型接收
	请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。

 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生身高");
        String height = sc.next();
        System.out.println("请输入学生是否结婚");
        String hasMarried = sc.next();
        System.out.println("请输入学生性别");
        String genger = sc.next();

        Student stu = new Student();

        stu.setName(name);
        stu.setAge(Integer.parseInt(age));
        stu.setHeight(Double.parseDouble(height));
        stu.setHasMarried(Boolean.parseBoolean(hasMarried));
        stu.setGenger(genger.charAt(0));

        System.out.println(stu.toString());
    }
}
class Student{
    private String name;
    private int age;
    private double height;
    private boolean hasMarried;
    private char genger;

    public Student(String name, int age, double height, boolean hasMarried, char genger) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hasMarried = hasMarried;
        this.genger = genger;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasMarried() {
        return hasMarried;
    }

    public void setHasMarried(boolean hasMarried) {
        this.hasMarried = hasMarried;
    }

    public char getGenger() {
        return genger;
    }

    public void setGenger(char genger) {
        this.genger = genger;
    }

    @Override
    public String toString() {
        return "Stuedet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hasMarried=" + hasMarried +
                ", genger=" + genger +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.height, height) != 0) return false;
        if (hasMarried != student.hasMarried) return false;
        if (genger != student.genger) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


}