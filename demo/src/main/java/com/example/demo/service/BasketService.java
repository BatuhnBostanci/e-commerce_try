package com.example.demo.service;

import com.example.demo.entitiy.Basket;
import com.example.demo.entitiy.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.BasketRepository;
import com.example.demo.request.BasketRequest;
import com.example.demo.response.BasketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    public BasketResponse addProductInBasket(BasketRequest request, int userid) {
        Basket basket = basketRepository.findById(userid).orElseThrow(() -> new RuntimeException("Basket not found"));

        Product product = productRepository.findByName(request.getProductName());
        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        List<Product> products = getProducts(basket);


        basket.setProducts(products);
        basketRepository.save(basket);
        return toResponse(basket);
    }

    private BasketResponse toResponse(Basket basket) {
        return null;
    }

    private static List<Product> getProducts(Basket basket) {
        List<Product> products = basket.getProductList();
        return products;
    }

    public List<BasketResponse> getAllProductsInBasket() {
        return null;
    }

    public void deleteProductByIdFromBasket(int basketId, int productId) {

    }

    public BasketResponse doPaymentAndEmptyBasket(int basketID, int userID) {
        return null;
    }
}
