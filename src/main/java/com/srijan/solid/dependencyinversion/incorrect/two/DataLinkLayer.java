package com.srijan.solid.dependencyinversion.incorrect.two;

public class DataLinkLayer {
    PhysicalLayer physicalLayer;
    NetworkLayer networkLayer;

    public void setNetworkLayer(NetworkLayer networkLayer) {
        this.networkLayer = networkLayer;
    }

    public void setPhysicalLayer(PhysicalLayer physicalLayer) {
        this.physicalLayer = physicalLayer;
    }

    public void transmitToPhysicalLayer(String data) {
        System.out.println("-- DLL - TX --");
        System.out.println("{ " + data +" }");
        physicalLayer.sendDataToNetwork(data);
    }

    public void receiveFromPhysicaLayer(String data)  {
        System.out.println("--- DLL - RX ---");
        networkLayer.receiveFromDataLink(data);
    }
}
