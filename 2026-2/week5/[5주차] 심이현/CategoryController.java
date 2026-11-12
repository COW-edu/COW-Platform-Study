package com.example.demo.controller;

import com.example.demo.dto.CategoryResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("api/categories")
    public CategoryResponseDto createCategory(@Valid @RequestBody CategoryResponseDto requestDto){
        return categoryService.createCategory(requestDto);
    }

    @PatchMapping("api/categories/{id}")
    public CategoryResponseDto updateCategory(@Valid @RequestBody CategoryResponseDto requestDto, @PathVariable Long categoryId) {
        return categoryService.updateCategory(requestDto, categoryId);
    }

    @GetMapping("api/categories")
    public List<CategoryResponseDto> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("api/categories/{id}")
    public CategoryResponseDto getCategory(@PathVariable Long categoryId){
        return categoryService.getCategory(categoryId);
    }

    @DeleteMapping("api/categories/{id}")
    public void deleteCategory(@PathVariable Long categoryId){
        categoryService.deleteCategory(categoryId);
}


}
