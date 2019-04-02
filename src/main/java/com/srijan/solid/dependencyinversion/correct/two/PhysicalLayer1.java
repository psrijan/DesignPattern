package com.srijan.solid.dependencyinversion.correct.two;

public class PhysicalLayer1 extends AbstractProtocolLayer implements ProtocolLayer{

    @Override
    public void transmit(String data) {
        System.out.println("PL - TX");
        System.out.printf("Data: { %s }  transmitted to external network \n" , data);
    }

    @Override
    public void receive(String data) {
        System.out.println("PL - RX");
        super.receive(data);
    }
}
