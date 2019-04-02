package com.srijan.solid.openclosed.correct.one.connector;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public interface IPaymentConnector {

    public boolean initiatePayment(PaymentDTO dto);

}
