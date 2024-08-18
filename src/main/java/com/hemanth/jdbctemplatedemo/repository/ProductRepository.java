package com.hemanth.jdbctemplatedemo.repository;

import com.hemanth.jdbctemplatedemo.model.Products;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Products product) {
        String query = "INSERT INTO products(id, name, description, quantity, price) VALUES (?,?,?,?,?);";
        jdbcTemplate.update(query, product.getId(), product.getName(), product.getDescription(), product.getQuantity(), product.getPrice());
    }
}
