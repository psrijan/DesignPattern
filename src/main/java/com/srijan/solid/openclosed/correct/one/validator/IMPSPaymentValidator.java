package com.srijan.solid.openclosed.correct.one.validator;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class IMPSPaymentValidator implements IPaymentValidator {

    public boolean validatePayment(PaymentDTO dto) {

        if(dto.getAmount() < 1000) {
            return false;
        }
        return true;
    }
}
