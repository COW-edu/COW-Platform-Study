package com.example.demo;

import lombok.Getter;

@Getter
public class TodoUpdateDto {
    private String title;
    private String content;
    private String date;
    private boolean completed;
}

