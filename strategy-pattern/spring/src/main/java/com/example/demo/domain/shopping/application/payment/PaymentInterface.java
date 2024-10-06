package com.example.demo.domain.shopping.application.payment;

import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;

public interface PaymentInterface {
    ShoppingResponse.data buy(ShoppingRequest.buy dto);
}
