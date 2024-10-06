package org.example.payment.payment;

import org.example.payment.PaymentInterface;

public class Card implements PaymentInterface {
    private String name;
    private String cardNumber;

    public Card(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount);
        System.out.printf("카드로 결제 [name: %s, cardNumber: %s]\n", name, cardNumber);
    }
}
