package com.srijan.solid.openclosed.incorrect.one;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.two.core.IPayment;

public class AllPayment {

    public boolean pay(PaymentDTO paymentObject , String paymentType) {
        if(paymentType.equals("IPS")) {
            System.out.println("Starting IPS Payment");

            System.out.println(" Validating Your IPS Payment ");

            System.out.println(" Completed your IPS payment ");
            return true;
        } else if (paymentType.equals("IMPS")) {
            System.out.println("Starting IMPS Payment");

            System.out.println(" Validating Your IMPS Payment ");

            System.out.println(" Completed your IMPS payment ");
            return true;
        } else  {
            System.out.println("Starting GENERIC Payment");

            System.out.println(" Validating Your GENERIC Payment ");

            System.out.println(" Completed your GENERIC payment ");
            return true;
        }
    }
}
