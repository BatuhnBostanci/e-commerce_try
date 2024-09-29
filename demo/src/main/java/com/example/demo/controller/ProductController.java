package com.example.demo.controller;

import com.example.demo.request.ProductRequest;
import com.example.demo.response.ProductResponse;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductResponse addProduct(@RequestBody ProductRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping
    public List<ProductResponse> getAll() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public ProductResponse updateProduct(@RequestBody ProductRequest request, @PathVariable int id) {
        return productService.updateProduct(request, id);
    }
}
