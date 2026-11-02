package com.example.Todo.controller;

import com.example.Todo.dto.CategoryRequestDTO;
import com.example.Todo.dto.CategoryResponseDTO;
import com.example.Todo.service.CategoryService;
import java.util.List;

public class CategoryController {

    private final CategoryService categoryService;

    // 생성
    public void createCategory(CategoryRequestDTO requestDTO) {
        categoryService.createCategory(requestDTO);
    }

    // 하나 조회
    public CategoryResponseDTO getCategory(Long id) {
        return categoryService.getCategory(id);
    }

    // 전체 조회
    public List<CategoryResponseDTO> getCategories() {
        return categoryService.getCategories();
    }

    // 수정
    public void updateCategory(Long id, CategoryRequestDTO requestDTO) {
        categoryService.updateCategory(id, requestDTO);
    }

    // 삭제
    public void deleteCategory(Long id) {
        categoryService.deleteCategory(id);
    }
}