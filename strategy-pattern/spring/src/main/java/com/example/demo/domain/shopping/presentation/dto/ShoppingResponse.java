package com.example.demo.domain.shopping.presentation.dto;

import lombok.Builder;

public class ShoppingResponse {
    @Builder
    public record data(
            String name,
            String cardNumber,
            String username,
            int money
    ){}
}
