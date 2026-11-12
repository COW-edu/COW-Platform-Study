package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoUpdateResponseDto {
    private String title;
    private String content;
    private boolean completed;
    private Long categoryId;
    private Long Id;

    public TodoUpdateResponseDto(String title, String content, boolean completed, Long Id, Long categoryId) {
        this.title = title;
        this.content = content;
        this.completed = completed;
        this.Id = Id;
        this.categoryId = categoryId;
    }
}
