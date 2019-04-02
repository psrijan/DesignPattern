package com.srijan.solid.dependencyinversion.incorrect.two;

public class NetworkLayer {
    private ApplicationLayer applicationLayer;
    private DataLinkLayer dataLinkLayer;

    public void setApplicationLayer(ApplicationLayer applicationLayer) {
        this.applicationLayer = applicationLayer;
    }

    public void setDataLinkLayer(DataLinkLayer dataLinkLayer) {
        this.dataLinkLayer = dataLinkLayer;
    }

    public void transmitDataLink(String data) {
        System.out.println("-- NWL- TX --");
        dataLinkLayer.transmitToPhysicalLayer(data);

    }

    public void receiveFromDataLink(String data) {
        System.out.println(" -- NWL -RX -- ");
        applicationLayer.receive(data);
    }

}
