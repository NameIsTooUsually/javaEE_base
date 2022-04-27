package com.chenhao.edu.info.manager.controller;

import com.chenhao.edu.info.manager.domain.Student;
import com.chenhao.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);


    public void start() {
        to:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加");
                    addStudent();

                    break;
                case "2":
                    //System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查看");
                    findAll();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break to;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    public void updateStudent() {
        String id;
        while (true) {
            Student[] student = studentService.findAll();
            if (null == student) {
                System.out.println("查无信息，请添加后重试");
                return;
            }
            System.out.println("请输入要修改的学生学号");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("你输入的学生学号不存在，请重新输入");
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);
        studentService.updateStudent(stu);
    }

    private void deleteStudentById() {
        String id;
        while (true) {
            Student[] student = studentService.findAll();
            if (null == student) {
                System.out.println("查无信息，请添加后重试");
                return;
            }
            System.out.println("请输入要删除的学生学号");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("你输入的学生学号不存在，请重新输入");
            }
        }
        studentService.deletaStudentById(id);
        System.out.println("删除成功");

    }

    public void findAll() {
        Student[] student = studentService.findAll();
        if (null == student) {
            System.out.println("查无信息，请添加后重试");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < student.length; i++) {
            Student stu = student[i];
            if (null != stu) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t\t" + stu.getBirtuday());
            }
        }
    }

    public void addStudent() {


        String id;
        while (true) {
            System.out.println("请输入学生的学号");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("你输入学号已被占用，请检查后重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();

        Student stu = new Student(id, name, age, birthday);

        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
