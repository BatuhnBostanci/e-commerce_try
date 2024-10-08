package com.example.demo.entitiy;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private double price;

    @ManyToOne
    private Category category;

    // Getters and Setters

    public Product(int poductId, String productName, List<Category> categoryList) {
        this.poductId = poductId;
        this.productName = productName;
        this.categoryList = categoryList;
    }

     // Getters and Setters

    @ManyToOne
    private Category category;

    public Product() {

    }

    public int getPoductId() {
        return poductId;
    }

    public void setPoductId(int poductId) {
        this.poductId = poductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void setCategories(List<Category> categories) {

    }
}
