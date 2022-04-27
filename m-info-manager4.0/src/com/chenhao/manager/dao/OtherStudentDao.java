package com.chenhao.manager.dao;

import com.chenhao.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    //创建一个学生对象的集合，集合可以容纳五个学生对象
    //为了使每次传进来的对象都能存储，所以用static关键字修饰
    private static ArrayList<Student> arrStu = new ArrayList<>();
    static {
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","1998-11-11");
        Student stu3 = new Student("heima003","王五","25","1997-11-11");
        arrStu.add(stu1);
        arrStu.add(stu2);
        arrStu.add(stu3);
    }

    public boolean addStudent(Student stu) {
        //对studentService传递过来的学生对象进行存储
        arrStu.add(stu);
        //如果程序进行到此处，说明数组中元素都不为null.则表示存储失败
        return true;
    }

    public Student[] findAllStudent() {
        //将arrStu数组返回
        Student[] arrStudent = new Student[arrStu.size()];
        for (int i = 0; i < arrStu.size(); i++) {
            arrStudent[i] = arrStu.get(i);
        }
        return arrStudent;
    }

    public void deleteStudentById(String id) {
        //查找id所在元素的索引
        int index= getIndex(id);
        //在输入是已经判断过id存在了，此时不需要判断index是否为-1；
        arrStu.remove(index);
    }
    //根据学号返回所属对象的索引位置
    public int getIndex(String id){
        //假设不存在该id
        int index = -1;
        //遍历数组，对比学号
        for (int i = 0; i < arrStu.size(); i++) {
            Student student = arrStu.get(i);
            //如果数组中元素不为空，并且该元素的id与目标id相等。则返回该位置的索引
            if(null!=student&&id.equals(student.getId())){
                index = i;
                break;
            }
        }
        //程序执行到此位置，如果没有找到目标id，则返回的是-1；
        return index;
    }

    public void updateStudent(String id, Student stu) {
        //通过学号找到目标位置的索引
        int index = getIndex(id);
        arrStu.set(index,stu) ;
    }
}
