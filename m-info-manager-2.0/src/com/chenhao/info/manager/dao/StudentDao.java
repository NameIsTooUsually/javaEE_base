package com.chenhao.info.manager.dao;

import com.chenhao.info.manager.domain.Student;

public class StudentDao {
    //创建一个学生类型的数组，用static修饰，输入容量为5
    private static Student[] arrStu = new Student[5];
    static{
        Student stu1 = new Student("heima001","张三","23","1999-11-11");
        Student stu2 = new Student("heima002","李四","24","1998-11-11");
        Student stu3 = new Student("heima003","李四","25","1997-11-11");
        arrStu[0] = stu1;
        arrStu[1] = stu2;
        arrStu[2] = stu3;
    }

    public boolean addStudent(Student stu) {
        //对数组进行判断，是否能存下。
        //对数组进行遍历，如果数组中元素值为null，则可以放下，将这个学生对象放到该处。
        boolean flag = false;//先假设不能放下
        for (int i = 0; i < arrStu.length; i++) {
            //对数组进行遍历，如果数组中的的元素为null 则将stu赋值给它，并且将flag置为TRUE，并结束循环。
            if (null == arrStu[i]) {
                arrStu[i] = stu;
                flag = true;
                break;
            }
        }
        //将flag的值返回，入股为TRUE则添加成功
        return flag;
    }

    public Student[] findAllStudent() {
        return arrStu;
    }

    public void deleteStudentById(String id) {
        int index =getIndex(id);
        arrStu[index]=null;
    }

    //通过id得到学生对象的索引
    public int getIndex(String id) {
        int index = -1;
        //对数组进行遍历
        for (int i = 0; i < arrStu.length; i++) {
            Student stu = arrStu[i];
            //学生对象不为空，并且和目标id相等
            if (null != stu && id.equals(stu.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudentById(String updateId, Student stu) {
        int index = getIndex(updateId);
        arrStu[index]=stu;
    }
}
