package com.chenhao.manager.factory;

import com.chenhao.manager.dao.BaseStudentDao;
import com.chenhao.manager.dao.OtherStudentDao;
import com.chenhao.manager.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao() {
        return new StudentDao();
    }
}
