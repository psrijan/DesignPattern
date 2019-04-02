package com.srijan.solid.dependencyinversion.correct.two;

public class DataLinkLayer1 extends  AbstractProtocolLayer implements ProtocolLayer {

    @Override
    public void transmit(String data) {
        System.out.println("DLL -TX");
        super.transmit(data);
    }

    @Override
    public void receive(String data) {
        System.out.println("DLL - RX");
        super.receive(data);
    }


}
