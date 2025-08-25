package com.algoreddy.webapplication.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.algoreddy.webapplication.model.Product;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101, "iphone", 500), new Product(102, "canon camera", 600),
            new Product(103, "samsung s24", 50000));

   public List<Product> getProducts() {
        return products;

    }

}
