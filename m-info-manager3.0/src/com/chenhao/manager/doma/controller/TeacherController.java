package com.chenhao.manager.doma.controller;

import com.chenhao.manager.doma.Teacher;
import com.chenhao.manager.doma.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void menus() {


        loop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("1.添加老师");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("2.删除老师");
                    deletaTeacherById();
                    break;
                case "3":
                    //System.out.println("3.修改老师");
                    updateTeacher();
                    break;
                case "4":
                    //System.out.println("4.查看老师 ");
                    showTeacher();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break loop;
                default:
                    System.out.println("您的输入有误！！！");
                    break;

            }
        }
    }

    public void updateTeacher() {
        Teacher[] arrTeacher = teacherService.show();
        if (null == arrTeacher) {
            System.out.println("没有信息可以显示，请输入信息后再试");
            return;
        }
        String id = inputId();
        Teacher teacher = inputInfo(id);
        teacherService.updateTeacher(id, teacher);
        System.out.println("修改成功");
    }

    public void deletaTeacherById() {
        Teacher[] arrTeacher = teacherService.show();
        if (null == arrTeacher) {
            System.out.println("没有信息可以显示，请输入信息后再试");
            return;
        }
        //输入要删除的老师id的时候需要进行判断次id是否存在。如果不存在就需要重新进行删除
        String id;
        while (true) {
            System.out.println("请输入老师工号");
            id = sc.next();

            boolean exists = teacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("你输入的工号不存在，请检查后重新输入");
            }
        }
        teacherService.deletaTeacherById(id);
        System.out.println("删除成功");

    }

    public void showTeacher() {
        //显示老师的信息，先要进行判断，如果没有老师的信息则不能显示，并给出相应的提示
        Teacher[] arrTeacher = teacherService.show();
        if (null == arrTeacher) {
            System.out.println("没有信息可以显示，请输入信息后再试");
            return;
        }
        System.out.println("工号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher tea = arrTeacher[i];
            if (null != tea) {
                System.out.println(tea.getId() + "\t\t" + tea.getName() + "\t\t" + tea.getAge() + "\t\t" + tea.getBirthday());
            }
        }
    }

    public void addTeacher() {
        //对于输入的老师工号，需要进行判断，如果有重复的工号，需要进行相应提示
        //如果输入的工号已经存在，需要重新进行输入，知道输入正确。
        String id;
        while (true) {
            System.out.println("请输入老师工号");
            id = sc.next();
            //对工号进行判断
            boolean exist = teacherService.isExists(id);
            if (exist) {
                System.out.println("您输入的工号已存在，请重新输入");
            } else {
                break;
            }
        }
        Teacher teacher = inputInfo(id);

        boolean result = teacherService.addTeacher(teacher);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public String inputId() {
        String id;
        while (true) {
            System.out.println("请输入老师工号");
            id = sc.next();

            boolean exists = teacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("你输入的工号不存在，请检查后重新输入");
            }
        }
        return id;
    }

    public Teacher inputInfo(String id) {
        System.out.println("请输入老师姓名");
        String name = sc.next();
        System.out.println("请输入老师年龄");
        String age = sc.next();
        System.out.println("请输入老师生日");
        String birthday = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}
