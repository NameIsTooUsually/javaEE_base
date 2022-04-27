package com.chenhao.manager.doma.dao;

import com.chenhao.manager.doma.Student;

public abstract class BaseStudentDao {


    public abstract boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void deleteStudent(String id);

    public abstract int getIndex(String id);

    public abstract void updateStudent(String id, Student stu);
}
