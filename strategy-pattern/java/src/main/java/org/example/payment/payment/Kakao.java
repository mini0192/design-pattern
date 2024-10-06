package org.example.payment.payment;

import org.example.payment.PaymentInterface;

public class Kakao implements PaymentInterface {
    private String name;
    private String id;

    public Kakao(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount);
        System.out.printf("카카오로 결제 [name: %s, id: %s]\n", name, id);
    }
}
