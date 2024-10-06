package com.example.demo.domain.shopping.application.payment;

import com.example.demo.domain.shopping.domain.PaypalCard;
import com.example.demo.domain.shopping.domain.PaypalCardRepository;
import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaypalCardService implements PaymentInterface{

    private final PaypalCardRepository paypalCardRepository;
    @Override
    public ShoppingResponse.data buy(ShoppingRequest.buy dto) {
        PaypalCard user = paypalCardRepository.findByCardNumber(dto.cardNumber());
        // 정보 유효성 검사
        user.buy(dto.amount());
        paypalCardRepository.save(user);

        return ShoppingResponse.data.builder()
                .name(user.getName())
                .cardNumber(user.getCardNumber())
                .money(user.getMoney())
                .build();
    }
}
