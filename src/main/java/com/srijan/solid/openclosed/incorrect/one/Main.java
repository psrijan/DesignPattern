package com.srijan.solid.openclosed.incorrect.one;

import com.srijan.solid.openclosed.correct.one.dto.PaymentDTO;

public class Main {
    public static void main(String[] args ) {
        AllPayment payment = new AllPayment();
        payment.pay(new PaymentDTO("Jikesh" , "Namaste Bank" , 100.0) , "IPS");
        payment.pay(new PaymentDTO("Jikesh" , "Namaste Bank" , 100.0) , "IMPS");
        payment.pay(new PaymentDTO("Jikesh" , "Namaste Bank" , 100.0) , "Other");
//        payment.pay(new PaymentDTO("Jikesh" , "Namaste Bank" , 100.0) , "NTC");

        //change ips payment
        //change imps payment
        //chanfge generic payment
    }
}
