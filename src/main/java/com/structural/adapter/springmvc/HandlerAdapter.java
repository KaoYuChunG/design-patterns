package com.structural.adapter.springmvc;

public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter {

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }
}

class AnnotationHandlerAdapter implements  HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}

class HttpHandlerAdapter implements  HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}