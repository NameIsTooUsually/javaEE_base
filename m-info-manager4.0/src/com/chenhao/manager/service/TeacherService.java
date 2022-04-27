package com.chenhao.manager.service;

import com.chenhao.manager.domain.Teacher;
import com.chenhao.manager.dao.TeacherDao;
public class TeacherService {
    //类中的功能基本都会使用到studentDao对象，所以将其放在成员变量处
    private TeacherDao teacherDao = new TeacherDao();
    public boolean addStudent(Teacher stu) {
        //将学生信息传递给teacherDao
        return teacherDao.addTeacher(stu);
    }

    public boolean isExists(String id) {
        //对输入的学号进行判断，需要拿到所有学生信息进行遍历
        Teacher[] arrStu = teacherDao.findAllTeacher();
        //假设学号不存在
        boolean flag = false;
        //对数组进行遍历
        for (int i = 0; i < arrStu.length; i++) {
            Teacher teacher = arrStu[i];
            //如果数组中元素不为空，并且该元素的getid的内容与id相等。则表示存在相同学号
            if(null!=teacher&&id.equals(teacher.getId())){
                flag = true;
                break;
            }
        }
        //返回flag，如果学号不存在则返回初始值。如果存在则返回true；
        return flag;
    }

    public Teacher[] showTeacher() {
        //拿到学生数组，并检查素组内容是否为空，如果为空，就返回null.如果不为空就返回数组地址。
        Teacher[] arrStu = teacherDao.findAllTeacher();
        for (int i = 0; i < arrStu.length; i++) {
            //如果数组中有元素不为空，则数组不为空
            if(null!=arrStu[i]){
                return arrStu;
            }
        }
        //如果程序能执行到此处，则说明数组元素为空
        return null;
    }

    public void deleteTeacherById(String id) {
        //将需要删除的学号给到dao进行删除
        teacherDao.deleteTeacherById(id);
    }

    public void updateTeacher(String id, Teacher stu) {
        //将学号和学生对象给到dao进行修改
        teacherDao.updateTeacher(id,stu);

    }
}
