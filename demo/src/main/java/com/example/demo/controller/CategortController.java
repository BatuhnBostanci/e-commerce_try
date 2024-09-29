package com.example.demo.controller;

import com.example.demo.CategoryService.CategoryService;
import com.example.demo.request.CategoryRequest;
import com.example.demo.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategortController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public CategoryResponse createCategory(@RequestBody CategoryRequest request) {
        return (CategoryResponse) categoryService.createProductCategory(request);

    }

    @DeleteMapping("/{id}")
    public void deleteProductCategory(@PathVariable int id) {
        categoryService.deleteProductCategory(id);
    }

    @GetMapping
    public List<CategoryResponse> getAllProductCategories() {
        return categoryService.getAllProductCategories();
    }

    @PutMapping("/{id}")
    public CategoryResponse updateProductCategory(@RequestBody CategoryRequest request, @PathVariable int id) {
        return (CategoryResponse) categoryService.updateProductCategory(request, id);
    }
}
