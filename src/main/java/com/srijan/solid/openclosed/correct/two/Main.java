package com.srijan.solid.openclosed.correct.two;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.two.core.*;

public class Main {
    public static void main(String[] args ) {

        IPayment payment = new SimplePayment();
        PaymentDTO paymentDTO = new PaymentDTO("Srijan" , "Siddhartha" , 100D);
        payment.pay(paymentDTO);

        payment = new IMPSPayment();
        payment.pay(paymentDTO);

        payment = new IPSPayment();
        payment.pay(paymentDTO);
        //where ever you require the type of payment you can inject payment code.

    }
}
