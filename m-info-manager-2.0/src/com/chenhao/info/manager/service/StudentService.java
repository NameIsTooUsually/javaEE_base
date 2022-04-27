package com.chenhao.info.manager.service;

import com.chenhao.info.manager.domain.Student;
import com.chenhao.info.manager.dao.StudentDao;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    private Student[] arrStu = studentDao.findAllStudent();

    //增加学生信息
    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    //判断学生id是否被占用
    public boolean isExists(String id) {
        //学号是否存在，则需要从studentDao中得到学生数组进行判断

        boolean flag = false;//假设目标id不存在
        //对数组进行遍历
        for (int i = 0; i < arrStu.length; i++) {
            Student stu = arrStu[i];
            //如果数组元素stu不为空，且等于目标id.则目标id已存在
            if (null != stu && id.equals(stu.getId())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Student[] showStudent() {
        //从StudentDao中拿到数组，判断数组是否为空
        boolean flag = false;
        for (int i = 0; i < arrStu.length; i++) {
            Student stu = arrStu[i];
            //只要有元素不为空，则数组不为空
            if (null != stu) {
                flag = true;
                break;
            }
        }
        if(flag){
            return arrStu;
        }else{
            return null;
        }
    }

    public void deleteStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudentById(String updateId, Student stu) {
        studentDao.updateStudentById(updateId, stu);
    }
}
