package com.srijan.solid.openclosed.correct.two.core;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class IPSPayment extends AbstractPayment {

    @Override
    public boolean pay(PaymentDTO paymentObject) {
        System.out.println("Starting IPS Payment");

        System.out.println(" Validating Your IPS Payment ");

        System.out.println(" Completed your IPS payment ");
        return true;
    }
}
