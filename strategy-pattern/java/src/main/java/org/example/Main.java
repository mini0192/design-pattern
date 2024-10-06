package org.example;

import org.example.payment.PayContext;
import org.example.payment.payment.Card;
import org.example.payment.payment.Kakao;
import org.example.payment.payment.PayPal;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("강아지", "12345");
        Kakao kakao = new Kakao("고양이", "cat123");
        PayPal payPal = new PayPal("마루");

        PayContext payContext = new PayContext();

        payContext.buy(card, 300);
        payContext.buy(kakao, 9000);
        payContext.buy(payPal, 10);
    }
}