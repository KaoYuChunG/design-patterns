package com.structural.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {


    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
