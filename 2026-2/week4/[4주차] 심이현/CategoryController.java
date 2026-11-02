package com.example.demo.controller;

import com.example.demo.dto.CategoryCreateResponseDto;
import com.example.demo.dto.CategoryResponseDto;
import com.example.demo.dto.CategoryUpdateResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")

public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public CategoryResponseDto createCategory(@Valid @RequestBody CategoryCreateResponseDto requestDto){
        return categoryService.createCategory(requestDto);
    }

    @PatchMapping("/{id}")
    public CategoryResponseDto updateCategory(@Valid @RequestBody CategoryUpdateResponseDto requestDto, @PathVariable Long categoryId) {
        return categoryService.updateCategory(requestDto, categoryId);
    }

    @GetMapping
    public List<CategoryResponseDto> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("/{id}")
    public CategoryResponseDto getCategory(@PathVariable Long categoryId){
        return categoryService.getCategory(categoryId);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long categoryId){
        categoryService.deleteCategory(categoryId);
    }


}
