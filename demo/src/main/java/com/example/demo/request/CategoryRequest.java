package com.example.demo.request;

public class CategoryRequest {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CategoryRequest(String category) {
        this.category = category;

    }
}
