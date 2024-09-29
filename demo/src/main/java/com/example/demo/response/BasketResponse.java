package com.example.demo.response;

public class BasketResponse {
    private String basketId;
    private String basketName;
    private String basketAddress;

    public String getBasketId() {
        return basketId;
    }

    public void setBasketId(String basketId) {
        this.basketId = basketId;
    }

    public String getBasketName() {
        return basketName;
    }

    public void setBasketName(String basketName) {
        this.basketName = basketName;
    }

    public String getBasketAddress() {
        return basketAddress;
    }

    public void setBasketAddress(String basketAddress) {
        this.basketAddress = basketAddress;
    }

    public BasketResponse(String basketId, String basketName, String basketAddress) {
        this.basketId = basketId;
        this.basketName = basketName;
        this.basketAddress = basketAddress;

    }
}
