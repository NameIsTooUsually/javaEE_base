package com.chenhao.info.manager.controller;

import com.chenhao.info.manager.domain.Student;
import com.chenhao.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private Scanner sc = new Scanner(System.in);

    private StudentService studentService = new StudentService();

    public final void menus() {
        //创建菜单，让用户可以用键盘录入进行选择
        //创建菜单，让用户可以用键盘录入进行选择
        loop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    //创建一个增加学生的方法。
                    addStudent();
                    break;
                case "2":
                    deleteStudentById();
                    break;
                case "3":
                    updateStudentById();
                    break;
                case "4":
                    showStuden();
                    break;
                case "5":
                    System.out.println("5.退出");
                    break loop;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
                    break;
            }
        }
    }

    public final void updateStudentById() {
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("暂无学生信息，请添加后查看");
            return;
        }
        //通过学号对学生信息进行修改，则需要判断学号是否存在，如果不存在需要重新输入
        String updateId = inputId();
        Student stu = inputInfo(updateId);
        studentService.updateStudentById(updateId, stu);

        System.out.println("修改成功");
    }

    public final void deleteStudentById() {
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("暂无学生信息，请添加后查看");
            return;
        }
        //通过学号对学生信息进行删除，则需要判断学号是否存在，如果不存在需要重新输入
        String deleId = inputId();
        //学号存在，将学号给到service进行删除
        studentService.deleteStudentById(deleId);
        System.out.println("删除成功");
    }

    public final void showStuden() {
        //展示学生信息。先判断是否有学生信息。如果没有给出相应提示，如果有则进行打印
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("暂无学生信息，请添加后查看");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < arrStu.length; i++) {
            //数组中可能存在空元素，需要进行判断
            Student stu = arrStu[i];
            if (null != arrStu[i]) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }

    }

    public final void addStudent() {
        //提示用户输入学生信息
        //输入学生学号的时候进行判断。该学号是否已经存在，如果存在需要继续输入

        String id;
        while (true) {
            System.out.println("请输入学生的学号");
            id = sc.next();
            //将用户输入的学号给到service中进行判断
            boolean result = studentService.isExists(id);
            //如果学号存在则需要重新输入。如果不存在则可以输入其他信息
            if (result) {
                System.out.println("您输入的学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        Student stu = inputInfo(id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //对输入学生id的代码进行封装，
    public final String inputId() {
        String id;
        while (true) {
            System.out.println("请输入学生的学号");
            id = sc.next();
            //将用户输入的学号给到service中进行判断
            boolean result = studentService.isExists(id);
            if (result) {
                break;
            } else {
                System.out.println("您输入的学号不存在，请重新输入");
            }
        }
        return id;
    }

    //对输入学生信息的代码进行封装
    public abstract Student inputInfo(String id);



}
