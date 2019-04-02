package com.srijan.solid.openclosed.correct.one;

import com.srijan.solid.openclosed.correct.one.connector.IMPSPaymentConnector;
import com.srijan.solid.openclosed.correct.one.connector.IPSPaymentConnector;
import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;
import com.srijan.solid.openclosed.correct.one.impl.Payment;
import com.srijan.solid.openclosed.correct.one.validator.IMPSPaymentValidator;
import com.srijan.solid.openclosed.correct.one.validator.IPSPaymentValidator;

public class Main {

    public static void main(String[] args ) {
        Payment impsPayment = new Payment(new IMPSPaymentValidator() , new IMPSPaymentConnector());
        impsPayment.pay(new PaymentDTO("Srijan" , "Nabil Bank" , 100.0));
        impsPayment.pay(new PaymentDTO("Santosh" , " Machapuchre bank" , 1000D));

        Payment ipsPayment = new Payment(new IPSPaymentValidator() , new IPSPaymentConnector());
        ipsPayment.pay(new PaymentDTO("Rashim" , "Nabil Bank" , 500.0));
        ipsPayment.pay(new PaymentDTO("Santosh" , " Machapuchre bank" , 10000D));

    }
}
