package com.hemanth.jdbctemplatedemo.service;

import com.hemanth.jdbctemplatedemo.model.Products;
import com.hemanth.jdbctemplatedemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Products products){
        productRepository.save(products);
    }
}
