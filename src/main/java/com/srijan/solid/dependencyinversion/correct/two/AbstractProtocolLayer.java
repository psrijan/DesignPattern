package com.srijan.solid.dependencyinversion.correct.two;

public class AbstractProtocolLayer implements ProtocolLayer {

    public ProtocolLayer layerUp;
    public ProtocolLayer layerDown;

    @Override
    public void initialize(ProtocolLayer layerUp, ProtocolLayer layerDown) {
        this.layerDown=layerDown;
        this.layerUp=layerUp;
    }

    @Override
    public void transmit(String data) {
        layerDown.transmit(data);
    }

    @Override
    public void receive(String data) {
        layerUp.receive(data);
    }
}
