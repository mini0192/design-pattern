package com.example.demo.domain.shopping.application.payment;

import com.example.demo.domain.shopping.domain.KakaoCard;
import com.example.demo.domain.shopping.domain.KakaoCardRepository;
import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KakaoCardService implements PaymentInterface {

    private final KakaoCardRepository kakaoCardRepository;
    @Override
    public ShoppingResponse.data buy(ShoppingRequest.buy dto) {
        KakaoCard user = kakaoCardRepository.findByUsername(dto.username());
        // 정보 유효성 검사
        user.buy(dto.amount());
        kakaoCardRepository.save(user);

        return ShoppingResponse.data.builder()
                .name(user.getName())
                .username(user.getUsername())
                .money(user.getMoney())
                .build();
    }
}
