package com.example.demo.CategoryService;

import com.example.demo.entitiy.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.request.CategoryRequest;
import com.example.demo.response.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository productCategoryRepository;

    public CategoryResponse createProductCategory(CategoryRequest request) {
        Category category = toEntity(request);
        productCategoryRepository.save(category);
        return toResponse(category);
    }

    public void deleteProductCategory(int id) {
        productCategoryRepository.deleteById(id);
    }

    public <CategoryResponse> List<CategoryResponse> getAllProductCategories() {
        List<Category> categories = productCategoryRepository.findAll();
        List<CategoryResponse> productCategoryResponses = new ArrayList<>();

        for (Category category : categories) {
            productCategoryResponses.add((CategoryResponse) toResponse(category));
        }
        return productCategoryResponses;
    }

    public CategoryResponse updateProductCategory(CategoryRequest request, int id) {
        Category existingCategory = productCategoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Product category not found"));

        existingCategory.setName(request.getCategory());

        Category save = productCategoryRepository.save(existingCategory);

        return toResponse(existingCategory);
    }

    public Category toEntity(CategoryRequest request) {
        Category category = new Category();
        category.setName(request.getCategory());
        return category;
    }

    public CategoryResponse toResponse(Category category) {
        CategoryResponse category1 = new CategoryResponse();
        category1.setProductCategory(category.getName());
        return (category1);
    }
}
