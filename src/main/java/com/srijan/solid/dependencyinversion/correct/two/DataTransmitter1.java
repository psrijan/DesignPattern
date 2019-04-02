package com.srijan.solid.dependencyinversion.correct.two;


public class DataTransmitter1 {

    public static void main(String[] args ) {

//        ProtocolLayer physicalLayer= new PhysicalLayer1();
//        ProtocolLayer dataLinkLayer = new DataLinkLayer1();
//        ProtocolLayer networkLayer = new NetworkLayer1();
//        ProtocolLayer applicationLayer = new ApplicationLayer1();
//
//        applicationLayer.initialize(null, networkLayer);
//        networkLayer.initialize(applicationLayer,dataLinkLayer);
//        dataLinkLayer.initialize(networkLayer, physicalLayer);
//        physicalLayer.initialize(dataLinkLayer, null);
//
//        applicationLayer.transmit("hi how are you ");
//        physicalLayer.receive("Hey im good");


        ProtocolLayer ddosProtocolLayer = new DdosAttackScanLayer();
        ProtocolLayer physicalLayer= new PhysicalLayer1();
        ProtocolLayer dataLinkLayer = new DataLinkLayer1();
        ProtocolLayer networkLayer = new NetworkLayer1();
        ProtocolLayer applicationLayer = new ApplicationLayer1();

        applicationLayer.initialize(null, networkLayer);
        networkLayer.initialize(applicationLayer,dataLinkLayer);
        dataLinkLayer.initialize(networkLayer, physicalLayer);
        physicalLayer.initialize(dataLinkLayer, ddosProtocolLayer);
        ddosProtocolLayer.initialize(physicalLayer, null);

        applicationLayer.transmit("hi how are you ");

        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");
        ddosProtocolLayer.receive("Hey im good");

    }

}
