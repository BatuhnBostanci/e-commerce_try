package com.example.demo.response;

public class CategoryResponse {
    private String productCategory;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public CategoryResponse(String productCategory) {
        this.productCategory = productCategory;
    }

    public CategoryResponse() {
    }
}
