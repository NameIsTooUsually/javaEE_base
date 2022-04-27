package com.chenhao.dao;

import com.chenhao.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (null == stus[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stus[index] = stu;
            return true;
        }
    }

    public Student[] findAll() {
        return stus;
    }

    public void deleteStudentById(String id) {
        int index = getIndex(id);
        stus[index] = null;
    }

    public void updateStudentById(String updateId, Student newStu) {
        int index = getIndex(updateId);
        stus[index] = newStu;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && id.equals(student.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
