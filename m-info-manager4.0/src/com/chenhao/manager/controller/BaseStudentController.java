package com.chenhao.manager.controller;

import com.chenhao.manager.domain.Student;
import com.chenhao.manager.service.StudentService;

import java.util.Scanner;
/*
该模块的内容是与用户直接进行交互，将会实现添加、删除、修改、显示、退出功能
 */
//创建一个键盘录入对象

public abstract class BaseStudentController {
    private Scanner sc = new Scanner(System.in);
    //增删改查功能都要用到studentService对象，所以将其放在成员变量处
    private StudentService studentService = new StudentService();

    public final void start() {

        //每个功能都需要调用Studentservice中的方法所以在循环外创建对象
        //这是学生管理系统开始的方法。也需要一个死循环，展示用户的选择界面
        loop:
        while ((true)) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            //通过分支语句对用户输入的选择进行判断，并执行相应的部分
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    //添加学生功能，只需要对学生信息进行录入，传递给Studentservice。

                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("查看学生");
                    //查看学生，将数组中的学生信息展示出来
                    showStudent();
                    break;
                case "5":
                    System.out.println("感谢您的使用！！！");
                    //采用break标号进行退出
                    break loop;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
                    break;

            }
        }
    }

    public final void updateStudent() {
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("没有学生信息，请输入后重试");
            return;
        }
        //让用户输入要修改的学生学号
        String id = inputStudentId();

        //学号确认好后，输入学生信息

        Student stu = inputStudentInfo(id);
        //将学号和id传给Service
        studentService.updateStudent(id, stu);
        System.out.println("修改成功");
    }

    public final void deleteStudentById() {
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("没有学生信息，请输入后重试");
            return;
        }
        //删除学生信息，只用将要删除的学生学号给到service即可
        //但是删除前需要判断学号是否存在
        String id = inputStudentId();
        //将学号给到Service
        studentService.deleteStudentById(id);
        System.out.println("删除成功");
    }

    public final void showStudent() {
        //展示学生信息，程序开始是没有学生信息的，为了防止这种情况，需要在一开始进行判断
        //如果返回值为null，则表示没有学生信息。
        Student[] arrStu = studentService.showStudent();
        if (null == arrStu) {
            System.out.println("没有学生信息，请输入后重试");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
        //对数组进行遍历并打印
        for (int i = 0; i < arrStu.length; i++) {
            Student student = arrStu[i];
            //判断数组元素是否为空，如果不为空就进打印。
            if (null != student) {
                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
            }
        }
    }

    public final void addStudent() {
        //给出提示，让用户录入学生信息
        //输入学号的时候需要进行判断学号是否存在。如果学号不存在才能输入其他信息。如果学号存在则需要重新输入
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.next();
            //调用studentService中的方法进行判断
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("您输入的学号已被占用，请重新输入！！");
            } else {
                break;
            }
        }


        Student stu = inputStudentInfo(id);

        //将学生对象传递给studentservice
        boolean result = studentService.addStudent(stu);
        //对返回值进行判断
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public final String inputStudentId() {
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.next();
            boolean result = studentService.isExists(id);
            //如果学生信息存在就不需要再输入了
            if (result) {
                break;
            } else {
                System.out.println("您输入的学号不存在，请重新输入");
            }
        }
        return id;
    }
    public abstract Student inputStudentInfo(String id);
}
