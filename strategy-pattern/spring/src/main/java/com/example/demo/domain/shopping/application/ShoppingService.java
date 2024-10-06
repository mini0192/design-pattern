package com.example.demo.domain.shopping.application;

import com.example.demo.domain.shopping.application.payment.KakaoCardService;
import com.example.demo.domain.shopping.application.payment.PaypalCardService;
import com.example.demo.domain.shopping.domain.KakaoCard;
import com.example.demo.domain.shopping.domain.KakaoCardRepository;
import com.example.demo.domain.shopping.domain.PaypalCard;
import com.example.demo.domain.shopping.domain.PaypalCardRepository;
import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingService {
    private final KakaoCardRepository kakaoCardRepository;
    private final PaypalCardRepository paypalCardRepository;

    private final KakaoCardService kakaoCardService;
    private final PaypalCardService paypalCardService;
    private final PayContext payContext;

    public ShoppingResponse.data buy(ShoppingRequest.buy dto) {
        if(dto.card().equals("kakao")) return payContext.buy(kakaoCardService, dto);
        else if(dto.card().equals("paypal")) return payContext.buy(paypalCardService, dto);
        return null;
    }

    // 테스트용 데이터
    public void makeUser() {
        kakaoCardRepository.save(
                KakaoCard.builder()
                        .name("홍길동")
                        .username("user12")
                        .money(100000)
                        .build()
        );

        paypalCardRepository.save(
                PaypalCard.builder()
                        .name("홍길동")
                        .cardNumber("111122223333")
                        .money(99999999)
                        .build()
        );
    }
}
