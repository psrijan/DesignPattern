package com.srijan.solid.dependencyinversion.incorrect.two;

public class ApplicationLayer {
    private NetworkLayer networkLayer;

    public void setNetworkLayer(NetworkLayer networkLayer) {
        this.networkLayer = networkLayer;
    }

    public void transmit(String data) {
        System.out.println("AL - TX");
        networkLayer.transmitDataLink(data);
    }

    public void receive(String data) {
        System.out.println("AL - RX ");
        System.out.println("Received Data Packet: { " + data + " } ");
    }

}
