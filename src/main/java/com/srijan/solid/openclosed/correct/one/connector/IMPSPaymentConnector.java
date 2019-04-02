package com.srijan.solid.openclosed.correct.one.connector;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class IMPSPaymentConnector implements IPaymentConnector {
    public boolean initiatePayment(PaymentDTO dto) {
        System.out.println("----IMPS----");
        System.out.printf(" Dear %s IMPS Payment of %.2f Successful and has been transfered to bank %s , "
                ,dto.getName() , dto.getAmount() , dto.getBank());
        return true;
    }
}
