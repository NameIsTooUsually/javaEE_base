package com.chenhao.manager.doma.controller;

import com.chenhao.manager.doma.Student;
import com.chenhao.manager.doma.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();
    @Override
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }
}
