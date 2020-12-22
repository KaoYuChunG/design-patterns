package com.creational.prototype.deep;

public class Client {

    public static void main(String[] args) throws Exception{
//        Deep p = new Deep();
//        p.name = "Tom";
//        p.deepClone = new DeepClone("Jack", "class Jack");
//
//        Deep p2 = (Deep)p.clone();
//
//        System.out.println(p.hashCode()+"-"+p.deepClone.hashCode());
//        System.out.println(p2.hashCode()+"-"+p2.deepClone.hashCode());

        System.out.println("========Deep======");
        Deep p = new Deep();
        p.name = "Tom";
        p.deepClone = new DeepClone("Jack", "class Jack");

        Deep p2 = (Deep)p.deepClonee();

        System.out.println(p.hashCode()+"-"+p.deepClone.hashCode());
        System.out.println(p2.hashCode()+"-"+p2.deepClone.hashCode());


    }
}
