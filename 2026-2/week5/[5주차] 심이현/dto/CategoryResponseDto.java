package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryResponseDto {
    private String name;
    private Long categoryId;

    public CategoryResponseDto(Long categoryId, String name){
        this.name = name;
        this.categoryId = categoryId;
    }

}
