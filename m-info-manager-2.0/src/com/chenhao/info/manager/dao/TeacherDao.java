package com.chenhao.info.manager.dao;

import com.chenhao.info.manager.domain.Teacher;

public class TeacherDao {
    //创建存储老师对象的数组，容量为5；
    private static Teacher[] arrTeacher = new Teacher[5];
    static{
        Teacher teacher1 = new Teacher("001","一狗","34","1995-1-11");
        Teacher teacher2 = new Teacher("002","二狗","33","1994-1-11");
        Teacher teacher3 = new Teacher("003","三狗","32","1993-1-11");
        arrTeacher[0] = teacher1;
        arrTeacher[1] = teacher2;
        arrTeacher[2] = teacher3;
    }
    public boolean addTeacher(Teacher teacher) {
        //增加老师信息，对数组进行遍历，如果元素为null，则将老师对象放到该位置。
        boolean flag = false;
        for (int i = 0; i < arrTeacher.length; i++) {
            if (null == arrTeacher[i]) {
                arrTeacher[i] = teacher;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Teacher[] findAllTeacher() {
        return arrTeacher;
    }

    public void deleteTeacherById(String delWId) {
        int index = getIndex(delWId);
        arrTeacher[index] = null;
    }

    public int getIndex(String wId) {
        int index = -1;
        //对数组进行遍历，对每一个老师对象的工号进行匹配
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher teacher = arrTeacher[i];
            if (null != teacher && wId.equals(teacher.getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacherById(String updateWId,Teacher teacher) {
        int index = getIndex(updateWId);
        arrTeacher[index] = teacher;
    }
}
