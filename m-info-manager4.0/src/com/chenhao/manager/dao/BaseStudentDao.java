package com.chenhao.manager.dao;

import com.chenhao.manager.domain.Student;

public interface BaseStudentDao {
    //创建一个学生对象的集合，集合可以容纳五个学生对象
    //为了使每次传进来的对象都能存储，所以用static关键字修饰

    public abstract boolean addStudent(Student stu) ;

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String id) ;
    //根据学号返回所属对象的索引位置
    public abstract int getIndex(String id);

    public abstract void updateStudent(String id, Student stu);
}
