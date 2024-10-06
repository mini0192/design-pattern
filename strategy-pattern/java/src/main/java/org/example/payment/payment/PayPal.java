package org.example.payment.payment;

import org.example.payment.PaymentInterface;

public class PayPal implements PaymentInterface {
    private String name;

    public PayPal(String name) {
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount);
        System.out.printf("카카오로 결제 [name: %s]\n", name);
    }
}
