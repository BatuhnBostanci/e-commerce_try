package com.example.demo.controller;

import com.example.demo.request.BasketRequest;
import com.example.demo.response.BasketResponse;
import com.example.demo.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {
    @Autowired
    private BasketService basketService;
    @PostMapping("/{id}")
    public BasketResponse addProductInBasket(@RequestBody BasketRequest request, @PathVariable int id){
        return basketService.addProductInBasket(request,id);
    }
    @GetMapping
    public List<BasketResponse> getAllItems(){
        return basketService.getAllProductsInBasket();
    }
    @DeleteMapping("/{basketId}/{productId}")
    public void removeProductFromBasket(@PathVariable int basketId,@PathVariable int productId){
        basketService.deleteProductByIdFromBasket(basketId,productId);
    }
}
