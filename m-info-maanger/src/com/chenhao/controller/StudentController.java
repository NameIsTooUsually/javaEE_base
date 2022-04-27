package com.chenhao.controller;

import com.chenhao.domain.Student;
import com.chenhao.service.Service;

import java.util.Scanner;

public class StudentController {
    private Service service = new Service();
    private Scanner sc = new Scanner(System.in);

    //开启学生管理系统，并展示学生管理系统菜单
    public void start() {
        to:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudentById();
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAll();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    //如果用户选择的是5，则退出循环。可以用break标号。也可以用return 结束这个方法。
                    break to;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
                    break;
            }
        }
    }

    public void updateStudentById() {
        Student[] stus = service.findAll();
        if (null == stus) {
            System.out.println("没有学生信息，请输入后重新选择");
            return;
        }

        String updateId = inputStudentId();
        Student newStu = inputStudentInfo(updateId);
        service.updateStudentById(updateId,newStu);
        System.out.println("修改成功");



    }

    public void deleteStudentById() {
        Student[] stus = service.findAll();
        if (null == stus) {
            System.out.println("没有学生信息，请输入后重新选择");
            return;
        }
        String delId = inputStudentId();
        service.deleteStudentById(delId);
        System.out.println("删除成功");


    }

    public void findAll() {
        Student[] stus = service.findAll();
        if (null == stus) {
            System.out.println("没有学生信息，请输入后重新选择");
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
            for (int i = 0; i < stus.length; i++) {
                Student students = stus[i];
                if (students != null) {
                    System.out.println(students.getId() + "\t" + students.getName() + "\t" + students.getAge() + "\t\t" + students.getBirthday());
                }
            }
        }
    }

    public void addStudent() {

        //键盘接收学生信息

        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.next();
            boolean flag = service.isExists(id);
            if (flag) {
                System.out.println("学号已经被占用，请重新输入");
            } else {
                break;
            }
        }
         Student stu = inputStudentInfo(id);
        boolean result = service.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    //键盘录入学生信息
    public String inputStudentId(){
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.next();
            boolean flag = service.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("你输入的学号不存在");
            }
        }
        return id;
    }
    //键盘录入学生信息
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name =sc.next();
        System.out.println("请输入学生年龄");
        String age =sc.next();
        System.out.println("请输入学生生日");
        String birthday =sc.next();
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }
}
