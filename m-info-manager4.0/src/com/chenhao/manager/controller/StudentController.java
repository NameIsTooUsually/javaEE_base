package com.chenhao.manager.controller;

import com.chenhao.manager.domain.Student;
import com.chenhao.manager.service.StudentService;

import java.util.Scanner;
/*
该模块的内容是与用户直接进行交互，将会实现添加、删除、修改、显示、退出功能
 */
//创建一个键盘录入对象

public class StudentController extends BaseStudentController{
    private Scanner sc = new Scanner(System.in);
    //增删改查功能都要用到studentService对象，所以将其放在成员变量处
    private StudentService studentService = new StudentService();

    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        //信息录入好后封装成学生对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
