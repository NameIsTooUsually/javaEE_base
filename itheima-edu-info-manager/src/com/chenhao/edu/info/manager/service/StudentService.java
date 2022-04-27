package com.chenhao.edu.info.manager.service;

import com.chenhao.edu.info.manager.dao.StudentDao;
import com.chenhao.edu.info.manager.domain.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    private Student[] stu = studentDao.allStudent();


    public boolean addStudent(Student stu) {

        return studentDao.addStudent(stu);

    }

    public boolean isExists(String id) {
        boolean exists = false;
        for (int i = 0; i < stu.length; i++) {
            Student student = stu[i];
            //如果学生对象不为空，且学生对象中的id和输入的id相等则将exists置为空；
            if (null != student && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAll() {
        boolean flag = false;
        for (int i = 0; i < stu.length; i++) {
            if (null != stu[i]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return stu;
        }else{
            return null;
        }
    }

    public void deletaStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(Student stu) {
        studentDao.updateStudent(stu);
    }
}
