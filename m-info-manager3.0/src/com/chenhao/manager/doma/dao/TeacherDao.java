package com.chenhao.manager.doma.dao;

import com.chenhao.manager.doma.Teacher;

public class TeacherDao {
    private static Teacher[] arrTeacher = new Teacher[5];
    static{
        Teacher stu1 = new Teacher("heima001","张三","23","1999-11-11");
        Teacher stu2 = new Teacher("heima002","李四","24","1998-11-11");
        Teacher stu3 = new Teacher("heima003","王五","25","1997-11-11");
        arrTeacher[0] = stu1;
        arrTeacher[1] = stu2;
        arrTeacher[2] = stu3;
    }
    public boolean addTeacher(Teacher teacher) {
        //对数组进行判断。如果数组中元素还有空的，那就说明没有存满，可以继续存储，
        //如果所有元素都不为空则数组存满了
        boolean flag = false ;//假设数组元素已经存满
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher tea = arrTeacher[i];
            //遍历数组，遇到的第一个null元素。将teacher放进去
            if(null==tea){
                arrTeacher[i] = teacher;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Teacher[] findAllTeacher() {
        //将老师的信息的输入给到service；
        return arrTeacher;
    }

    public void deletaTeacherById(String id) {
        int index = getIndex(id);
        arrTeacher[index] = null;
    }
    //根据id得到索引
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < arrTeacher.length; i++) {
            Teacher tea = arrTeacher[i];
            if(null!=tea && id.equals(tea.getId())){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacher(String id, Teacher teacher) {
        int index = getIndex(id);
        arrTeacher[index] = teacher;
    }
}
