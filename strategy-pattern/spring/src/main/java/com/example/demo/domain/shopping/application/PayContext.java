package com.example.demo.domain.shopping.application;

import com.example.demo.domain.shopping.application.payment.PaymentInterface;
import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;
import org.springframework.stereotype.Service;

@Service
public class PayContext {
    public ShoppingResponse.data buy(PaymentInterface pay, ShoppingRequest.buy dto) {
        return pay.buy(dto);
    }
}
