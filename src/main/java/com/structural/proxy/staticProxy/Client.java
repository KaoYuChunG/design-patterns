package com.structural.proxy.staticProxy;

public class Client {
    public static void main(String[] args){
//        TeacherDao dao = new TeacherDao();

        StudentDao dao = new StudentDao();

        DaoProxy teacherDaoProxy = new DaoProxy(dao);

        teacherDaoProxy.teach();

    }
}
