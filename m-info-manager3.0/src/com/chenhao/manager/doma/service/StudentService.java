package com.chenhao.manager.doma.service;

import com.chenhao.manager.doma.Student;
import com.chenhao.manager.doma.dao.StudentDao;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        //判断id是否存在，需要从studentDao中获取所有学生信息。
        Student[] arrStu = studentDao.findAllStudent();
        //对获得的数组进行遍历
        boolean flag = false;
        for (int i = 0; i < arrStu.length; i++) {
            Student student = arrStu[i];
            if(null!=student&&id.equals(student.getId())){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Student[] showStudent() {
        Student[] arrStu = studentDao.findAllStudent();
        //对数组进行判断，如果有一个不为空，则数组就不为空
        for (int i = 0; i < arrStu.length; i++) {
            if(null!=arrStu[i]){
                return arrStu;
            }
        }
        return null;
    }

    public void deleteStudent(String id) {
        studentDao.deleteStudent(id);
    }

    public void updateStudent(String id,Student stu) {
        studentDao.updateStudent(id,stu);
    }
}
