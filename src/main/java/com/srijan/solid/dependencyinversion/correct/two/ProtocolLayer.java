package com.srijan.solid.dependencyinversion.correct.two;

public interface ProtocolLayer {
    public void  transmit(String data);
    public void receive(String data);
    public void initialize(ProtocolLayer layerUp, ProtocolLayer layerDown);
}
