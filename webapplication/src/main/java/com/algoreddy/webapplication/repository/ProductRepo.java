package com.algoreddy.webapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algoreddy.webapplication.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    

}
