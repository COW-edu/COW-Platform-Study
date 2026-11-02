
package com.example.todo.domain.todo.controller;

import com.example.todo.domain.todo.dto.TodoCreateRequestDTO;
import com.example.todo.domain.todo.dto.TodoUpdateRequestDTO;
import com.example.todo.domain.todo.dto.TodoDetailResponseDTO;

import java.util.List;

public class TodoController {

    private final TodoService todoService;

    // Todo 생성: 새로운 할 일을 등록
    public TodoDetailResponseDTO createTodo(TodoCreateRequestDTO request) {
        return todoService.createTodo(request);
    }

    // Todo 단건 조회: ID를 이용해 특정 할 일 조회
    public TodoDetailResponseDTO getTodo(Long todoId) {
        return todoService.getTodo(todoId);
    }

    // Todo 목록 조회: 전체 할 일 목록 조회
    public List<TodoDetailResponseDTO> getTodos() {
        return todoService.getTodos();
    }

    // Todo 수정: ID로 할 일을 찾아 요청받은 내용으로 수정
    public TodoDetailResponseDTO updateTodo(Long todoId, TodoUpdateRequestDTO request) {
        return todoService.updateTodo(todoId, request);
    }

    // Todo 삭제: ID에 해당하는 할 일 삭제
    public void deleteTodo(Long todoId) {
        todoService.deleteTodo(todoId);
    }
}
