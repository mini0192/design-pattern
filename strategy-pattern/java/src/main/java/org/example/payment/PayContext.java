package org.example.payment;

public class PayContext {
    public void buy(PaymentInterface payment, int amount) {
        payment.pay(amount);
        System.out.println();
    }
}
