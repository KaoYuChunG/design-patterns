package com.structural.adapter.interfaceadapter;

import com.structural.adapter.classadapter.Phone;
import com.structural.adapter.classadapter.VoltageAdapter;

public class Client {

    public static void main(String[] args){
       AbsAdapter absAdapter = new AbsAdapter() {
           @Override
           public void m1() {
               System.out.println("client m1");
           }
       };

        absAdapter.m1();
        absAdapter.m2();
    }
}
