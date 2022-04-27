package com.chenhao.manager.doma.dao;

import com.chenhao.manager.doma.Student;

import java.util.ArrayList;

public class OtherStudentDao extends BaseStudentDao {

    private static ArrayList<Student> arrStu = new ArrayList<Student>();

    static{
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","1998-11-11");
        Student stu3 = new Student("heima003","王五","25","1997-11-11");
        arrStu.add(stu1);
        arrStu.add(stu2);
        arrStu.add(stu3);
    }

    public boolean addStudent(Student stu) {
        //存学生信息，需要查看是否有位置，对数组进行遍历，如果数组中有null,则是有位置，将该位置置为stu即可。
        arrStu.add(stu);
        return true;
    }

    public Student[] findAllStudent() {
        //使用集合进行改进，由于之前返回值是数组，为了不修改service里面的内容，所以返回值还是数组
        //创建一个数组，数组长度和集合大小相同，从集合中拿出值放到数组中去

        Student[] students = new Student[arrStu.size()];
        for (int i = 0; i < arrStu.size(); i++) {
            students[1] = arrStu.get(i);
        }
        return students;
    }

    public void deleteStudent(String id) {
        int index = getIndex(id);
        arrStu.remove(index);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < arrStu.size(); i++) {
            Student student = arrStu.get(i);
            if (null != student && id.equals(student.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student stu) {
        int index = getIndex(id);
        arrStu.set(index,stu);
    }
}
