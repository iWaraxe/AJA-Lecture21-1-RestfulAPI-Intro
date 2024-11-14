package com.coherentsolutions.advanced.java.restapi.controllers;

import com.coherentsolutions.advanced.java.restapi.entity.Product;
import com.coherentsolutions.advanced.java.restapi.exceptions.ProductNotFoundException;
import com.coherentsolutions.advanced.java.restapi.repository.Ex03ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing products.
 */
@RestController
@RequestMapping("/products")
public class Ex04ProductController {

    private Ex03ProductRepository productRepository = new Ex03ProductRepository();

    /**
     * Retrieves all products.
     * @return List of products.
     */
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Retrieves a product by ID.
     * @param id Product ID.
     * @return Product if found, null otherwise.
     * @throws ProductNotFoundException in case product with id not found
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    /**
     * Creates a new product.
     * @param product Product to create.
     * @return Created product.
     */
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    /**
     * Updates an existing product.
     * @param id Product ID.
     * @param product Updated product data.
     * @return Updated product if found, null otherwise.
     */
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Product p = existingProduct.get();
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            return p;
        } else {
            return null;
        }
    }

    /**
     * Deletes a product by ID.
     * @param id Product ID.
     */
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
