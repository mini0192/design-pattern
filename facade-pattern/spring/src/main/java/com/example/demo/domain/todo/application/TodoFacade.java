package com.example.demo.domain.todo.application;

import com.example.demo.domain.todo.domain.Todo;
import com.example.demo.domain.todo.presentation.dto.TodoRequest;
import com.example.demo.domain.todo.presentation.dto.TodoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoFacade {
    private final TodoService todoService;
    public void save(TodoRequest.Save dto) {
        Todo entity = Todo.builder()
                .title(dto.title())
                .content(dto.content())
                .build();

        todoService.save(entity);
    }

    public List<TodoResponse.FindAll> findAll() {
        List<Todo> savedEntity = todoService.findAll();
        return savedEntity.stream().map(entity -> TodoResponse.FindAll.builder()
                        .title(entity.getTitle())
                        .content(entity.getContent())
                        .build()).toList();
    }
}
