package com.chenhao.manager.entry;

import com.chenhao.manager.controller.OtherStudentController;
import com.chenhao.manager.controller.StudentController;
import com.chenhao.manager.controller.TeacherController;

import java.util.Scanner;

public class InfoManaferEntry {
    /*
    信息管理系统的入口程序，程序开始执行时会展示信息管理系统菜单
    让用户做出相应的选择。
    菜单放入一个死循环中，如果用户选择了退出选项才会退出。
     */
    public static void main(String[] args) {
        //创建对象的代码尽量写在循环外面
        Scanner sc = new Scanner(System.in);

        //先写一个死循环
        while (true) {
            //打印菜单
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            //用户通过键盘录入进行选择
            String choice = sc.next();//接收用户的选择
            //通过switch()分支语句进行选择
            switch (choice) {
                case "1":
                    //用户选择1进去学生管理系统。与用户进行交互的功能在controller中，这里需要创建一个controller对象
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    System.out.println("学生管理");
                    break;
                case "2":
                    System.out.println("老师管理");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用！！！");
                    //通过exit退出
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
            }
        }
    }
}
