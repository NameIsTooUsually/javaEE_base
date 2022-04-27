package com.chenhao.manager.controller;

import java.util.Scanner;
import com.chenhao.manager.domain.Teacher;
import com.chenhao.manager.service.TeacherService;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    public void start() {

        loop:
        while ((true)) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            //通过分支语句对用户输入的选择进行判断，并执行相应的部分
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加老师");
                    //添加老师功能，只需要对老师信息进行录入teacherService。

                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    System.out.println("查看老师");
                    //查看老师，将数组中的学生信息展示出来
                    showTeacher();
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
    public void updateTeacher() {
        //让用户输入要修改的学生学号
        String id = inputTeacherId();

        //学号确认好后，输入学生信息

        Teacher stu = inputTeacherInfo(id);
        //将学号和id传给Service
        teacherService.updateTeacher(id, stu);
        System.out.println("修改成功");
    }

    public void deleteTeacherById() {
        //删除学生信息，只用将要删除的学生学号给到service即可
        //但是删除前需要判断学号是否存在
        String id = inputTeacherId();
        //将学号给到Service
        teacherService.deleteTeacherById(id);
        System.out.println("删除成功");
    }

    public void showTeacher() {
        //展示学生信息，程序开始是没有学生信息的，为了防止这种情况，需要在一开始进行判断
        //如果返回值为null，则表示没有学生信息。
        Teacher[] arrStu = teacherService.showTeacher();
        if (null == arrStu) {
            System.out.println("没有学生信息，请输入后重试");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
        //对数组进行遍历并打印
        for (int i = 0; i < arrStu.length; i++) {
            Teacher teacher = arrStu[i];
            //判断数组元素是否为空，如果不为空就进打印。
            if (null != teacher) {
                System.out.println(teacher.getId() + "\t\t" + teacher.getName() + "\t\t" + teacher.getAge() + "\t\t" + teacher.getBirthday());
            }
        }
    }

    public void addTeacher() {
        //给出提示，让用户录入学生信息
        //输入学号的时候需要进行判断学号是否存在。如果学号不存在才能输入其他信息。如果学号存在则需要重新输入
        String id;
        while (true) {
            System.out.println("请输入老师工号");
            id = sc.next();
            //调用TeacherService中的方法进行判断
            boolean flag = teacherService.isExists(id);
            if (flag) {
                System.out.println("您输入的工号已被占用，请重新输入！！");
            } else {
                break;
            }
        }


        Teacher stu = inputTeacherInfo(id);

        //将老师对象传递给TeacherService
        boolean result = teacherService.addStudent(stu);
        //对返回值进行判断
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public String inputTeacherId() {
        String id;
        while (true) {
            System.out.println("请输入老师工号");
            id = sc.next();
            boolean result = teacherService.isExists(id);
            //如果学生信息存在就不需要再输入了
            if (result) {
                break;
            } else {
                System.out.println("您输入的工号不存在，请重新输入");
            }
        }
        return id;
    }
    public Teacher inputTeacherInfo(String id){
        System.out.println("请输入老师姓名");
        String name = sc.next();
        System.out.println("请输入老师年龄");
        String age = sc.next();
        System.out.println("请输入老师生日");
        String birthday = sc.next();
        //信息录入好后封装成学生对象
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}
