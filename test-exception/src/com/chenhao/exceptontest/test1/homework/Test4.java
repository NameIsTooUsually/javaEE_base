package com.chenhao.exceptontest.test1.homework;

import java.util.Scanner;

/*
请按以下步骤要求编写代码：
- 定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
- 定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
- 定义一个Student类，属性：姓名、性别、年龄。
  ​	在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
  ​	在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
- 编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("请输入学生姓名");
        String name = sc.next();
        stu.setName(name);

        while (true) {

            try {
                System.out.println("请输入学生性别");
                String gender = sc.next();
                stu.setGender(gender);
                break;
            } catch (SexException s) {
                System.out.println(s.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("请输入学生年龄");
                int age = sc.nextInt();
                stu.setAge(age);
                break;
            } catch (AgeException a) {
                System.out.println(a.getMessage());
            }
        }
        System.out.println(stu);
    }
}

class Student {
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (!("男".equals(gender) || "女".equals(gender))) {
            throw new SexException("性别异常");
        } else {
            this.gender = gender;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 50) {
            throw new AgeException("年龄异常");
        } else {
            this.age = age;
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}

class SexException extends RuntimeException {
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }
}