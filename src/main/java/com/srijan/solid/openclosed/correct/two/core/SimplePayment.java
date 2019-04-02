package com.srijan.solid.openclosed.correct.two.core;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class SimplePayment extends AbstractPayment{

    @Override
    public boolean pay(PaymentDTO paymentObject) {
        return super.pay(paymentObject);
    }
}
