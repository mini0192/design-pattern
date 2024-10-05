package com.example.demo.domain.todo.presentation.dto;

public class TodoRequest {
    public record Save(
            String title,
            String content
    ){}
}
