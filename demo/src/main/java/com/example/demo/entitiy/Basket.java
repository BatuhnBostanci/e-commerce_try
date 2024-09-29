package com.example.demo.entitiy;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int basketId;

    private String basketName;
    @OneToMany
    private List<Product> productList;

    public Basket() {
    }

    public Basket(int basketId, String basketName, List<Product> productList) {
        this.basketId = basketId;
        this.basketName = basketName;
        this.productList = productList;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public String getBasketName() {
        return basketName;
    }

    public void setBasketName(String basketName) {
        this.basketName = basketName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setProducts(List<Product> products) {

    }
}
