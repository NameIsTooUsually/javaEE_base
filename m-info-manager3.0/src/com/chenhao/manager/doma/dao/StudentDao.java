package com.chenhao.manager.doma.dao;

import com.chenhao.manager.doma.Student;

import java.util.ArrayList;

public class StudentDao {
    private static Student[] arrStu = new Student[5];
    static{
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","1998-11-11");
        Student stu3 = new Student("heima003","王五","25","1997-11-11");
        arrStu[0] = stu1;
        arrStu[1] = stu2;
        arrStu[2] = stu3;
    }

    public boolean addStudent(Student stu) {
        //存学生信息，需要查看是否有位置，对数组进行遍历，如果数组中有null,则是有位置，将该位置置为stu即可。
        boolean flag = false;
        for (int i = 0; i < arrStu.length; i++) {
            if (null == arrStu[i]) {
                arrStu[i] = stu;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Student[] findAllStudent() {
        return arrStu;
    }

    public void deleteStudent(String id) {
        int index = getIndex(id);
        arrStu[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < arrStu.length; i++) {
            Student student = arrStu[i];
            if (null != student && id.equals(student.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student stu) {
        int index = getIndex(id);
        arrStu[index] = stu;
    }
}
