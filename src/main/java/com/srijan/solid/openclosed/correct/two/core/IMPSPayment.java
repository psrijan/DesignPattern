package com.srijan.solid.openclosed.correct.two.core;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class IMPSPayment extends AbstractPayment {

    @Override
    public boolean pay(PaymentDTO paymentObject) {
        System.out.println("Starting IMPS Payment");

        System.out.println(" Validating Your IMPSPayment ");

        System.out.println(" Completed your IMPS payment ");
        return true;
    }
}
