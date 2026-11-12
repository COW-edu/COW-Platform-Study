package com.example.demo;

import lombok.Getter;

public class TodoCreateRequestDto {
    @Getter
    private String title;
    private String content;
}
