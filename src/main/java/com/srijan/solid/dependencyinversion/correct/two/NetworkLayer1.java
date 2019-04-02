package com.srijan.solid.dependencyinversion.correct.two;

public class NetworkLayer1 extends AbstractProtocolLayer implements ProtocolLayer {


    @Override
    public void transmit(String data) {
        System.out.println("NL - TX");
        super.transmit(data);
    }

    @Override
    public void receive(String data) {
        System.out.println("NL - RX");
        super.receive(data);
    }
}
