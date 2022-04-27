package com.chenhao.service;

import com.chenhao.dao.StudentDao;
import com.chenhao.domain.Student;

public class Service {
    private StudentDao studentDao = new StudentDao();
    private Student[] stus = studentDao.findAll();

    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (null != student && id.equals(student.getId())) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAll() {
        if (null == stus) {
            return null;
        }

        for (int i = 0; i < stus.length; i++) {
            if (null != stus[i]) {
                return stus;
            }
        }
        return null;
    }

    public void deleteStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudentById(String updateId, Student newStu) {
        studentDao.updateStudentById(updateId,newStu);
    }
}
