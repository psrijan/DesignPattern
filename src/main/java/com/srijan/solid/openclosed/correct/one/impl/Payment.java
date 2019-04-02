package com.srijan.solid.openclosed.correct.one.impl;

import com.srijan.solid.openclosed.correct.one.connector.IPaymentConnector;
import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.one.impl.IPayment;
import com.srijan.solid.openclosed.correct.one.validator.IPaymentValidator;

public class Payment implements IPayment {

    private IPaymentValidator paymentValidator;
    private IPaymentConnector paymentConnector;

    public Payment(IPaymentValidator paymentValidator , IPaymentConnector connector) {
        this.paymentValidator = paymentValidator;
        this.paymentConnector = connector;
    }

    public boolean pay(PaymentDTO paymentObject) {
        boolean isValid = paymentValidator.validatePayment(paymentObject);

        if(!isValid) {
            System.out.println("Some parameters aren't correct please ammend those fields");
            return false;
        }
        System.out.println("Initiate Payment : IPS ");

        return paymentConnector.initiatePayment(paymentObject);

    }
}
