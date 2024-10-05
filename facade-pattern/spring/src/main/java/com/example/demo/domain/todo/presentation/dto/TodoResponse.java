package com.example.demo.domain.todo.presentation.dto;

import lombok.Builder;

public class TodoResponse {
    @Builder
    public record FindAll(
            String title,
            String content
    ){}
}
