package com.example.Todo.controller;


import com.example.Todo.dto.TodoRequestDTO;
import com.example.Todo.dto.TodoResponseDTO;
import com.example.Todo.service.TodoService;
import java.util.List;

public class TodoController {

    private final TodoService todoService;

    // 생성
    public void createTodo(TodoRequestDTO requestDTO) {
        todoService.createTodo(requestDTO);
    }

    // 하나 조회
    public TodoResponseDTO getTodo(Long id) {
        return todoService.getTodo(id);
    }

    // 전체 조회
    public List<TodoResponseDTO> getTodos() {
        return todoService.getTodos();
    }

    // 수정
    public void updateTodo(Long id, TodoRequestDTO requestDTO) {
        todoService.updateTodo(id, requestDTO);
    }

    // 삭제
    public void deleteTodo(Long id) {
        todoService.deleteTodo(id);
    }
}