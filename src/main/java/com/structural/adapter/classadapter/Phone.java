package com.structural.adapter.classadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if( iVoltage5V.output5V() == 5) {
            System.out.println("Voltage 5, You can charg" );
        } else if(iVoltage5V.output5V() > 5) {
            System.out.println("Voltage is greater than 5...." );
        }
    }

}
