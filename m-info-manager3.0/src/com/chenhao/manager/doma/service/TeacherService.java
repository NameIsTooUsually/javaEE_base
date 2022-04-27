package com.chenhao.manager.doma.service;

import com.chenhao.manager.doma.Teacher;
import com.chenhao.manager.doma.dao.TeacherDao;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    public boolean isExists(String id) {
        //判断工号是否存在时，需要对已经存储的数据进行遍历。
        Teacher[] arrTeacher = teacherDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher tea = arrTeacher[i];
            if (null != tea && id.equals(tea.getId())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Teacher[] show() {
        //先拿到老师的数组，并对数组进行判，如果数组里面任意一个元素有值，则数组不为空，
        //如果数组里面所有的值都是空的，则数组里面没有值
        Teacher[] arrTeacher = teacherDao.findAllTeacher();
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher tea = arrTeacher[i];
            if(null!=tea){
                return arrTeacher;
            }
        }
        return null;
    }

    public void deletaTeacherById(String id) {
        teacherDao.deletaTeacherById(id);
    }

    public void updateTeacher(String id, Teacher teacher) {
        teacherDao.updateTeacher(id,teacher);
    }
}
