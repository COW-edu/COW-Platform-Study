package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoCreateRequestDto {
    private String title;
    private String content;
    private boolean completed;
    private Long categoryId;

    public TodoCreateRequestDto(String title, String content, boolean completed, Long categoryId){
        this.title = title;
        this.content = content;
        this.completed = completed;
        this.categoryId = categoryId;
    }

}
