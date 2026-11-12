package com.example.demo;

import lombok.Getter;

@Getter
public class TodoResponseDto {
    private String title;
    private String content;
    private boolean completed;
    private Long Id;
    private String date;
}

