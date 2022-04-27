package com.chenhao.info.manager.entry;

import com.chenhao.info.manager.controller.OtherStudentController;
import com.chenhao.info.manager.controller.TeacherController;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {
        OtherStudentController otherStudentController = new OtherStudentController();
        TeacherController teacherController = new TeacherController();
        Scanner sc = new Scanner(System.in);
        //创建菜单，让用户可以用键盘录入进行选择
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("学生管理");
                    otherStudentController.menus();
                    break;
                case "2":
                    //System.out.println("老师管理");
                    teacherController.menus();
                    break;
                case "3":
                    System.out.println("感谢您的使用！！！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
                    break;
            }
        }
    }
}
