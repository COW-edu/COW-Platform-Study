
package com.example.todo.domain.category.controller;

import com.example.todo.domain.category.dto.CategoryCreateRequestDTO;
import com.example.todo.domain.category.dto.CategoryUpdateRequestDTO;
import com.example.todo.domain.category.dto.CategoryDetailResponseDTO;

import java.util.List;

public class CategoryController {

    private final CategoryService categoryService;

    // Category 생성: 새로운 카테고리 등록
    public CategoryDetailResponseDTO createCategory(CategoryCreateRequestDTO request) {
        return categoryService.createCategory(request);
    }

    // Category 단건 조회: ID를 이용해 특정 카테고리 조회
    public CategoryDetailResponseDTO getCategory(Long categoryId) {
        return categoryService.getCategory(categoryId);
    }

    // Category 목록 조회: 전체 카테고리 목록 조회
    public List<CategoryDetailResponseDTO> getCategories() {
        return categoryService.getCategories();
    }

    // Category 수정: ID로 카테고리를 찾아 요청받은 내용으로 수정
    public CategoryDetailResponseDTO updateCategory(Long categoryId, CategoryUpdateRequestDTO request) {
        return categoryService.updateCategory(categoryId, request);
    }

    // Category 삭제: ID에 해당하는 카테고리 삭제
    public void deleteCategory(Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }
}
