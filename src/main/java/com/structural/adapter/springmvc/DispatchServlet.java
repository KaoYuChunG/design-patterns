package com.structural.adapter.springmvc;

import com.structural.adapter.classadapter.Phone;
import com.structural.adapter.classadapter.VoltageAdapter;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    public void doDispatch() {
        HttpController controller = new HttpController();
        //AnnotationController controller = new AnnotationController();

        HandlerAdapter adapter = getHandler(controller);

        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        for(HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args){
       new DispatchServlet().doDispatch();
    }
}
