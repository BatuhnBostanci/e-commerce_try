package com.example.demo.request;

public class BasketRequest {
    private String name;

    public BasketRequest() {
    }

    public BasketRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Object getProductName() {
        return null;
    }
}
