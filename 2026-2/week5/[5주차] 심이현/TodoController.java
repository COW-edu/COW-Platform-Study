package com.example.demo.controller;

import com.example.demo.dto.TodoCreateRequestDto;
import com.example.demo.dto.TodoResponseDto;
import com.example.demo.dto.TodoUpdateResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class TodoController {
    private final TodoService todoService;

    @PostMapping("api/todos")
    public TodoResponseDto createTodo(@RequestBody @Valid TodoCreateRequestDto requestDto){
        return todoService.createTodo(requestDto);
    }

    @PatchMapping("api/todos/{id}")
    public TodoResponseDto updateTodo(@RequestBody @Valid TodoUpdateResponseDto requestDto, @PathVariable Long id){
        return todoService.updateTodo(requestDto, id);
    }

    @GetMapping("api/todos")
    public List<TodoResponseDto> getTodos(){
        return todoService.getTodos();
    }

    @GetMapping("api/todos/{id}")
    public TodoResponseDto getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }

    @DeleteMapping("api/todos/{id}")
    public void deleteTodo(@PathVariable Long id){
    todoService.deleteTodo(id);
    }


}
