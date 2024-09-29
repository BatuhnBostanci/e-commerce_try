package com.example.demo.service;

import com.example.demo.entitiy.Category;
import com.example.demo.entitiy.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.request.ProductRequest;
import com.example.demo.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public ProductResponse createProduct(ProductRequest request) {
        Product product = toEntity(request);

        // Kategorileri ayarlama
        List<Category> categories = new ArrayList<>();
        for (String categoryName : request.getCategoryNames()) {
            Category category = categoryRepository.findByName(categoryName);
            if (category != null) {
                categories.add(category);
            }
        }
        product.setCategories(categories);
        productRepository.save(product);
        return toResponse(product);
    }

    private Product toEntity(ProductRequest request) {
        return null;
    }

    private ProductResponse toResponse(Product product) {
        return null;
    }

    public List<ProductResponse> getAllProducts() {
        return null;
    }

    public void deleteProduct(int id) {

    }

    public ProductResponse updateProduct(ProductRequest request, int id) {
        return null;
    }
}
