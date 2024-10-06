package com.example.demo.domain.shopping.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaypalCardRepository extends JpaRepository<PaypalCard, Long> {
    PaypalCard findByCardNumber(String cardNumber);
}
