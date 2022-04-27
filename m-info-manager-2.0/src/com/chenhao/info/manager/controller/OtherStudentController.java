package com.chenhao.info.manager.controller;

import com.chenhao.info.manager.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{

    Scanner sc = new Scanner(System.in);
    //对输入学生信息的代码进行封装
    public Student inputInfo(String id) {

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        String age = sc.next();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);

        return stu;
    }
}
