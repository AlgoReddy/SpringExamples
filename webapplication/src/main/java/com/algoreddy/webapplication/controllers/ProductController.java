package com.algoreddy.webapplication.controllers;

import java.security.Provider;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algoreddy.webapplication.model.Product;
import com.algoreddy.webapplication.service.ProductService;
import com.algoreddy.webapplication.service.*;;;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

}
