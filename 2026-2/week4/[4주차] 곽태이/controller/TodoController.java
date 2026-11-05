package com.example.todo.controller;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    // 생성
    @PostMapping
    public TodoDetailResponseDTO createTodo(@RequestBody TodoCreateRequestDTO request) {
        return todoService.createTodo(request);
    }

    // 단건 조회
    @GetMapping("/{id}")
    public TodoDetailResponseDTO getTodo(@PathVariable Long todoId) {
        return todoService.getTodo(todoId);
    }

    // 목록 조회
    @GetMapping
    public List<TodoListResponseDTO> getTodoList() {
        return todoService.getTodoList();
    }

    // 수정
    @PutMapping("/{id}")
    public TodoDetailResponseDTO updateTodo(@PathVariable Long todoId, @RequestBody TodoUpdateRequestDTO request) {
        return todoService.updateTodo(todoId, request);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long todoId) {
        todoService.deleteTodo(todoId);
    }
}
