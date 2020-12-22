package com.behavioral.state.stateflyweight;

public class FlyweightStatePattern {

    public static void main(String[] args) {
        ShareContext context = new ShareContext(); //创建环境
        context.Handle(); //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }

}
