package com.chenhao.info.manager.service;

import com.chenhao.info.manager.domain.Teacher;
import com.chenhao.info.manager.dao.TeacherDao;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    public boolean isExists(String wId) {
        //判断工号是否存在，需要拿到存储老师数组，进行遍历
        Teacher[] arrTeacher = teacherDao.findAllTeacher();

        boolean flag = false;
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher teacher = arrTeacher[i];
            if(null!=teacher && wId.equals(teacher.getId())){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Teacher[] showTeacher() {
        Teacher[] arrTeacher = teacherDao.findAllTeacher();
        //对数组进行遍历，如果其中有元素不为空，则数组不为空。如果为空，就返回null；
        boolean flag = false;
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher teacher = arrTeacher[i];
            if(null!=teacher){
                flag = true;
                break;
            }
        }
        if(flag){
            return arrTeacher;
        }else{
            return null;
        }
    }

    public void deleteTeacherById(String delWId) {
        teacherDao.deleteTeacherById(delWId);
    }

    public void updateTeacherById(String updateWId,Teacher teacher) {
        teacherDao.updateTeacherById(updateWId,teacher);
    }
}
