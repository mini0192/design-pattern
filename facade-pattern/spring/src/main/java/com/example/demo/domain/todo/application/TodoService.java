package com.example.demo.domain.todo.application;

import com.example.demo.domain.todo.domain.Todo;
import com.example.demo.domain.todo.domain.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public void save(Todo entity) {
        todoRepository.save(entity);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
