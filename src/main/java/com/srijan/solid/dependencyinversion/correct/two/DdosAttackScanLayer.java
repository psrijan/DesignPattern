package com.srijan.solid.dependencyinversion.correct.two;

import java.util.HashMap;
import java.util.Map;

public class DdosAttackScanLayer extends AbstractProtocolLayer implements ProtocolLayer {

    Map<String ,Integer> requestMap = new HashMap<>();

    @Override
    public void receive(String data) {
        updateRequestMap(data);
        if(isDDosAttack(data)) {
            System.out.println("Someone is attempting Ddos attack");
            System.out.println("Stopping data reception ");
        } else  {
            super.receive(data);
        }
    }

    private void updateRequestMap(String data )  {
        Integer requestNumber = requestMap.get(data);
        if(requestNumber == null ) {
            requestMap.put(data, 1);
        } else if(requestNumber!=null) {
            requestMap.put(data, ++requestNumber);
        }
    }

    private boolean isDDosAttack(String data ) {
        Integer requestNumber = requestMap.get(data);
        if(requestNumber != null && requestNumber > 10 ) {
            return true;
        }
        return false;
    }
}
