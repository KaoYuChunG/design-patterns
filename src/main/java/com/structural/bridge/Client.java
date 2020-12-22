package com.structural.bridge;

import com.structural.adapter.objectadapter.Voltage220V;
import com.structural.adapter.objectadapter.VoltageAdapter;

public class Client {

    public static void main(String[] args){
        Phone foldeXaiMi = new Folde( new XaiMi());
        foldeXaiMi.open();
        foldeXaiMi.close();
        foldeXaiMi.call();
        System.out.println("---------------------------");

        Phone upRightVivo = new UpRight( new Vivo());
        upRightVivo.open();
        upRightVivo.close();
        upRightVivo.call();
        System.out.println("---------------------------");

        Phone smart = new Smart( new Vivo());
        smart.open();
        smart.close();
        smart.call();
    }
}
