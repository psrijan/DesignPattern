package com.srijan.solid.dependencyinversion.incorrect.two;

public class DataTransmitter {
    /**
     * Application
     * Network
     * DataLink
     * Physical
     */


    public static void main(String[] args ) {
        PhysicalLayer physicalLayer = new PhysicalLayer();
        DataLinkLayer dataLinkLayer = new DataLinkLayer();
        NetworkLayer networkLayer = new NetworkLayer();
        ApplicationLayer applicationLayer = new ApplicationLayer();

        physicalLayer.setDataLinkLayer(dataLinkLayer);
        dataLinkLayer.setNetworkLayer(networkLayer);
        dataLinkLayer.setPhysicalLayer(physicalLayer);

        networkLayer.setApplicationLayer(applicationLayer);
        networkLayer.setDataLinkLayer(dataLinkLayer);

        applicationLayer.setNetworkLayer(networkLayer);

        String msg = "Hi how are you?";
        applicationLayer.transmit(msg);
        String ext_msg = "Hey I'm good";
        System.out.println("---- Receiving MEssage ------");
        physicalLayer.receiveDataFromNetwork(ext_msg);

    }

    public void initialize() {


    }

}
