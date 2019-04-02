package com.srijan.solid.openclosed.incorrect.two;

import com.srijan.solid.openclosed.correct.one.connector.IPSPaymentConnector;
import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.one.validator.IPSPaymentValidator;

public class Payment {
    private IPSPaymentValidator validator;
    private IPSPaymentConnector connector;

    public Payment(IPSPaymentValidator validator, IPSPaymentConnector connector) {
        this.validator = validator;
        this.connector = connector;
    }

    public boolean pay(PaymentDTO dto) {
        validator.validatePayment(dto);
        connector.initiatePayment(dto);
        return true;
    }


}
