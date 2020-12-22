package com.structural.proxy.dymanicProxy;

import com.structural.proxy.staticProxy.StudentDao;

public class Client {
    public static void main(String[] args){
        IDao target = new TeacherDao();

        IDao proxyInstance = (IDao)new DaoProxy(target).getProxyInstance();

        System.out.println("proxyInstance class-->"+ proxyInstance.getClass());
        System.out.println("proxyInstance-->"+ proxyInstance);

        proxyInstance.teach();
        proxyInstance.hello("Kao");

    }
}
