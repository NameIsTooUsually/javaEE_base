package com.chenhao.manager.doma.entry;

import com.chenhao.manager.doma.controller.OtherStudentController;
import com.chenhao.manager.doma.controller.StudentController;
import com.chenhao.manager.doma.controller.TeacherController;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OtherStudentController studentController = new OtherStudentController();
        TeacherController teacherController = new TeacherController();
        while(true){
            //打印菜单，让用户进行选择。
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();

            switch(choice){
                case "1":
                    //System.out.println("1学生管理");
                    studentController.menus();
                    break;
                case "2":
                    //System.out.println("2老师管理");
                    teacherController.menus();
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }

    }
}
