package com.structural.adapter.objectadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {

        int dst = 0;
        if(null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("usando object adapter. ");
            dst = src / 44;
            System.out.println("adapter pronto. ");
        }

        return dst;
    }
}
