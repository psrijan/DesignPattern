package com.srijan.solid.openclosed.correct.two.core;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public abstract class AbstractPayment implements IPayment{


    public boolean pay(PaymentDTO paymentObject) {
        System.out.println("Starting Generic Payment");

        System.out.println(" Validating Your Payment ");


        System.out.println(" Completed your generic payment ");
        return true;
    }
}
