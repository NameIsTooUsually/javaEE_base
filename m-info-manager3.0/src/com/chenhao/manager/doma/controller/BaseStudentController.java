package com.chenhao.manager.doma.controller;

import com.chenhao.manager.doma.Student;
import com.chenhao.manager.doma.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public final void menus() {
        loop:
        while (true) {
            //打印菜单，让用户进行选择。
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("1.添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("2.删除学生");
                    deleteStudent();
                    break;
                case "3":
                    //System.out.println("3.修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("4.查看学生");
                    showStudent();
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break loop;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    public final void updateStudent() {
        Student[] arrStu = studentService.showStudent();
        if(null ==arrStu){
            System.out.println("没有信息，请输入后重试");
            return;
        }
        String id =inputStudentId();
        Student stu = inputStudentInfo(id);
        studentService.updateStudent(id,stu);
        System.out.println("修改成功");
    }

    public final void deleteStudent() {
        Student[] arrStu = studentService.showStudent();
        if(null ==arrStu){
            System.out.println("没有信息，请输入后重试");
            return;
        }
        String id=inputStudentId();
        studentService.deleteStudent(id);
        System.out.println("删除成功");
    }

    public final void showStudent() {
        //显示学生信息。先需要查看是否有学生信息。如果没有学生信息，就不能进行查看。如果有按照相应格式打印出来
        Student[] arrStu = studentService.showStudent();
        if(null ==arrStu){
            System.out.println("没有信息，请输入后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < arrStu.length; i++) {
            //对学生信息进行打印。判断学生对象，如果不为空，就进行打印
            Student student = arrStu[i];
            if(null!=student){
                System.out.println(student.getId()+"\t\t"+student.getName()+"\t\t"+student.getAge()+"\t\t"+student.getBirthday());
            }
        }
    }

    public  final void addStudent() {
        //输入学生信息，并封装到学生对象
        String id;
        while (true) {
            //在输入学号的时候需要对id进行判断，是否已经存在。如果不存在才可继续输入学生信息
            System.out.println("请输入学生学号");
            id = sc.next();
            //将id给到service进行判断
            boolean exists = studentService.isExists(id);
            if(exists){
                System.out.println("您输入的学号已存在，请检查后重新输入");
            }else{
                break;
            }
        }
        Student stu = inputStudentInfo(id);
        //将学生对象给到service进行存储
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
    public String inputStudentId(){
        String id;
        while (true) {
            //在输入学号的时候需要对id进行判断，是否已经存在。如果不存在才可继续输入学生信息
            System.out.println("请输入学生学号");
            id = sc.next();
            //将id给到service进行判断
            boolean exists = studentService.isExists(id);
            if(exists){
                break;
            }else{
                System.out.println("您输入的学号不存在，请重新输入");
            }
        }
        return id;
    }

    public abstract Student inputStudentInfo(String id);
}
