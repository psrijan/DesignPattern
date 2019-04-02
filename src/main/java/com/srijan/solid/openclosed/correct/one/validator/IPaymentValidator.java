package com.srijan.solid.openclosed.correct.one.validator;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public interface IPaymentValidator {


    public boolean validatePayment(PaymentDTO dto);
}
