package com.algoreddy.webapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoreddy.webapplication.model.Product;
import com.algoreddy.webapplication.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
    // List<Product> products = new ArrayList<>(
    // Arrays.asList(new Product(101, "iphone", 500), new Product(102, "canon
    // camera", 600),
    // new Product(103, "samsung s24", 50000)));

    public List<Product> getProducts() {
        return repo.findAll();

    }

    public Product getProductById(int prodID) {
        return repo.findById(prodID).orElse(new Product(000, "No Item", 0));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
