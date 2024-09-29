package com.example.demo.entitiy;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int poductId;

    private String productName;
    @OneToMany
    private List<Category> categoryList;

    public Product(int poductId, String productName, List<Category> categoryList) {
        this.poductId = poductId;
        this.productName = productName;
        this.categoryList = categoryList;
    }

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
