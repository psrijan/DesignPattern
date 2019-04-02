package com.srijan.solid.dependencyinversion.correct.two;

public class ApplicationLayer1 extends AbstractProtocolLayer implements ProtocolLayer {


    @Override
    public void transmit(String data) {
        System.out.println("AL - TX");
        super.transmit(data);
    }

    @Override
    public void receive(String data) {
        System.out.println("AL - RX");
        System.out.printf(" Data received in UI { %s } \n" , data);
    }


}
