package com.structural.proxy.staticProxy;

public class DaoProxy implements IDao {

    private IDao target;

    public DaoProxy(IDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("starting the proxy");
        target.teach();
        System.out.println("ending the proxy");

    }
}
