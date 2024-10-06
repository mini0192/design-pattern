package com.example.demo.domain.shopping.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KakaoCardRepository extends JpaRepository<KakaoCard, Long> {
    KakaoCard findByUsername(String Username);
}
