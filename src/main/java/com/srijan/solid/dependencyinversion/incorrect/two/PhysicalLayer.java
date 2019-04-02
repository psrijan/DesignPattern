package com.srijan.solid.dependencyinversion.incorrect.two;

public class PhysicalLayer {
    DataLinkLayer dataLinkLayer;

    public void setDataLinkLayer(DataLinkLayer dataLinkLayer) {
        this.dataLinkLayer = dataLinkLayer;
    }

    public void sendDataToNetwork(String data) {
        System.out.println("--- PL - TX --");
        System.out.println("{ " + data +" }" + " has been sent to network");
    }

    public void receiveDataFromNetwork(String data) {
        System.out.println("-- PL - RX--");
        System.out.println("{ " + data +" }" + " has been Received from network");
        dataLinkLayer.receiveFromPhysicaLayer(data);
    }

}
