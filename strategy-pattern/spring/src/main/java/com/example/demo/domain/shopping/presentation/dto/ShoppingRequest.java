package com.example.demo.domain.shopping.presentation.dto;

import lombok.Builder;

public class ShoppingRequest {
    @Builder
    public record buy(
            String card,
            String name,
            String cardNumber,
            String username,
            int amount
    ){}
}
