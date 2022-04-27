package com.chenhao.manager.dao;

import com.chenhao.manager.domain.Teacher;

public class TeacherDao {
    //创建一个学生对象的集合，集合可以容纳五个学生对象
    //为了使每次传进来的对象都能存储，所以用static关键字修饰
    private static Teacher[] arrStu = new Teacher[5];
    public boolean addTeacher(Teacher stu) {
        //对studentService传递过来的学生对象进行存储
        //存储前需要判断数组是否已经存满
        for (int i = 0; i < arrStu.length; i++) {
            //对数组进行遍历，如果有元素值为null。则表示没有满，将其位置存入学生对象即可
            if(null == arrStu[i]){
                arrStu[i] = stu;
                return true;
            }
        }
        //如果程序进行到此处，说明数组中元素都不为null.则表示存储失败
        return false;
    }

    public Teacher[] findAllTeacher() {
        //将arrStu数组返回
        return arrStu;
    }

    public void deleteTeacherById(String id) {
        //查找id所在元素的索引
        int index= getIndex(id);
        //在输入是已经判断过id存在了，此时不需要判断index是否为-1；
        arrStu[index] = null;
    }
    //根据学号返回所属对象的索引位置
    public int getIndex(String id){
        //假设不存在该id
        int index = -1;
        //遍历数组，对比学号
        for (int i = 0; i < arrStu.length; i++) {
            Teacher Teacher = arrStu[i];
            //如果数组中元素不为空，并且该元素的id与目标id相等。则返回该位置的索引
            if(null!=Teacher&&id.equals(Teacher.getId())){
                index = i;
                break;
            }
        }
        //程序执行到此位置，如果没有找到目标id，则返回的是-1；
        return index;
    }

    public void updateTeacher(String id, Teacher stu) {
        //通过学号找到目标位置的索引
        int insex = getIndex(id);
        arrStu[insex] = stu;
    }
}
