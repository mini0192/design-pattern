package com.example.demo.domain.shopping.presentation;

import com.example.demo.domain.shopping.application.ShoppingService;
import com.example.demo.domain.shopping.presentation.dto.ShoppingRequest;
import com.example.demo.domain.shopping.presentation.dto.ShoppingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShoppingController {
    private final ShoppingService shoppingService;
    @PostMapping
    public ResponseEntity<ShoppingResponse.data> buy(@RequestBody ShoppingRequest.buy dto) {
        shoppingService.makeUser();
        return ResponseEntity.ok().body(shoppingService.buy(dto));
    }
}
