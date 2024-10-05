package com.example.demo.domain.todo.presentation;

import com.example.demo.domain.todo.application.TodoFacade;
import com.example.demo.domain.todo.presentation.dto.TodoRequest;
import com.example.demo.domain.todo.presentation.dto.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoFacade todoFacade;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody TodoRequest.Save dto) {
        todoFacade.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body("생성");
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse.FindAll>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(todoFacade.findAll());
    }
}
