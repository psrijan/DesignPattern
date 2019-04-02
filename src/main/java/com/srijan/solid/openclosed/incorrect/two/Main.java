package com.srijan.solid.openclosed.incorrect.two;

import com.srijan.solid.openclosed.correct.one.connector.IPSPaymentConnector;
import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.one.validator.IPSPaymentValidator;

public class Main {
    public static void main(String args[]) {
        //try changing it to IMPS payment
        Payment payment = new Payment(new IPSPaymentValidator() , new IPSPaymentConnector());
        payment.pay(new PaymentDTO("Prajwol" , "Everest Bank" , 10.0));
    }
}
