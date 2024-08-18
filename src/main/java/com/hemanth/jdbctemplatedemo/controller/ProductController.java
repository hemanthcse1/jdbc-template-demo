package com.hemanth.jdbctemplatedemo.controller;

import com.hemanth.jdbctemplatedemo.model.Products;
import com.hemanth.jdbctemplatedemo.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/save")
    public ResponseEntity<Map<String,String>> saveProduct(){
        try {
            Products products = new Products(1, "Mobile", "Cellular phones", 10, 1000);
            productService.saveProduct(products);

            Map<String, String> response = new HashMap<>();
            response.put("response", "Product saved successfully");

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Failed to save product: " + e.getMessage());
            return ResponseEntity.status(500).body(errorResponse);
        }
    }
}
