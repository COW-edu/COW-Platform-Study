package com.example.todo.controller;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    // 생성
    @PostMapping
    public CategoryDetailResponseDTO createCategory(@RequestBody CategoryCreateRequestDTO request) {
        return categoryService.createCategory(request);
    }

    // 단건 조회
    @GetMapping("/{id}")
    public CategoryDetailResponseDTO getCategory(@PathVariable Long categoryId) {
        return categoryService.getCategory(categoryId);
    }

    // 목록 조회
    @GetMapping
    public List<CategoryListResponseDTO> getCategoryList() {
        return categoryService.getCategoryList();
    }

    // 수정
    @PutMapping("/{id}")
    public CategoryDetailResponseDTO updateCategory(@PathVariable Long categoryId, @RequestBody CategoryUpdateRequestDTO request) {
        return categoryService.updateCategory(categoryId, request);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }
}