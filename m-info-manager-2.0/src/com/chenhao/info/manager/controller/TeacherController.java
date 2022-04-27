package com.chenhao.info.manager.controller;

import com.chenhao.info.manager.domain.Teacher;
import com.chenhao.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();


    public void menus() {
        loop:while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    //System.out.println("修改老师");
                    updateTeacherById();
                    break;
                case "4":
                    //System.out.println("查看老师");
                    showTeacher();
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

    public void updateTeacherById() {
        Teacher[] arrTeacher = teacherService.showTeacher();
        if(null == arrTeacher){
            System.out.println("暂无老师信息，请添加后重试");
            return;
        }
        String updateWId = inputId();
        Teacher teacher = inputInfo(updateWId);
        teacherService.updateTeacherById(updateWId,teacher);
        System.out.println("修改成功");
    }

    public void deleteTeacherById() {
        Teacher[] arrTeacher = teacherService.showTeacher();
        if(null == arrTeacher){
            System.out.println("暂无老师信息，请添加后重试");
            return;
        }
        String delWId = inputId();
        teacherService.deleteTeacherById(delWId);
        System.out.println("删除成功");
    }

    private void showTeacher() {
        //获取老师对象的数组
        Teacher[] arrTeacher = teacherService.showTeacher();
        if(null == arrTeacher){
            System.out.println("暂无老师信息，请添加后重试");
            return;
        }
        System.out.println("工号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher teacher = arrTeacher[i];
            if(null!=teacher){
                System.out.println(teacher.getId()+"\t"+teacher.getName()+"\t"+teacher.getAge()+"\t"+teacher.getBirthday());
            }
        }
    }

    public void addTeacher() {
        String id;
        while (true){
            //输入工号时，需要判断工号是否已经存在，如果存在需要充新输入
            System.out.println("请输入老师的工号");
            id= sc.next();
            boolean result = teacherService.isExists(id);
            if(result){
                System.out.println("您输入的工号已存在，请重新输入");
            }else{
                break;
            }
        }
        Teacher teacher = inputInfo(id);
        boolean result =teacherService.addTeacher(teacher);
        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    public String inputId(){
        String id;
        while (true){
            //输入工号时，需要判断工号是否已经存在，如果不存在需要重新输入
            System.out.println("请输入老师的工号");
            id= sc.next();
            boolean result = teacherService.isExists(id);
            if(result){
                break;
            }else{
                System.out.println("您输入的工号不存在，请检查后重新输入");            }
        }
        return id;
    }
    public Teacher inputInfo(String id){
        System.out.println("请输入老师的姓名");
        String name= sc.next();
        System.out.println("请输入老师的年龄");
        String age= sc.next();
        System.out.println("请输入老师的生日");
        String birthday= sc.next();
        //创建一个老师对象
        Teacher teacher = new Teacher();
        //对输入的老师信息进行封装
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}

