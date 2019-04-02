package com.srijan.solid.openclosed.correct.one.validator;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class IPSPaymentValidator implements IPaymentValidator {

    public boolean validatePayment(PaymentDTO dto) {

        if(dto.getAmount() < 100) {
            return false;
        }
        return true;
    }
}
