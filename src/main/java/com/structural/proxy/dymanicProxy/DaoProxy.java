package com.structural.proxy.dymanicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DaoProxy {

    private Object target;

    public DaoProxy(Object target) {
        this.target = target;
    }


    public Object getProxyInstance() {

        //第一 parametro: 使用類的加載器，獲取加載器的方法固定。
        //第二 parametro: 目標對象的實現接口類型，繼承。
        //第三 parametro: 執行目標對象的方法時會觸發的事件處理方法，把當前執行的目標對象方法做為參數傳入。
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("===JDK proxy===");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("===ok===");
                        return returnVal;
                    }
                });
    }
}
