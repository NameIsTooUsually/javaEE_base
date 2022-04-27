package com.chenhao.edu.info.manager.dao;

import com.chenhao.edu.info.manager.domain.Student;

public class StudentDao {
    //定义一个容量为5的学生对象类型的数组
    private static Student[] arr = new Student[5];

    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                index = i;
                break;
            }
        }

        if(index==-1){
            return false;
        }else{
            arr[index]=stu;
            return true;
        }
    }

    public Student[] allStudent() {
        return arr;
    }

    public void deleteStudentById(String id) {
        int index = findIndex(id);
        arr[index] = null;
    }
    public int findIndex(String id){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(null!=stu && id.equals(stu.getId()) ){
                index = i;
            }
        }
        return index;
    }

    public void updateStudent(Student stu) {
        int index = findIndex(stu.getId());
        arr[index] = stu;

    }
}
