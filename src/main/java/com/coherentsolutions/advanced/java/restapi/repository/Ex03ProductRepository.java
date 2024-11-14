package com.coherentsolutions.advanced.java.restapi.repository;

import com.coherentsolutions.advanced.java.restapi.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * In-memory repository for storing products.
 */
public class Ex03ProductRepository {

    private List<Product> products = new ArrayList<>();

    /**
     * Initializes the repository with some sample products.
     */
    public Ex03ProductRepository() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Smartphone", 499.99));
        products.add(new Product(3L, "Tablet", 299.99));
    }

    /**
     * Retrieves all products.
     * @return List of products.
     */
    public List<Product> findAll() {
        return products;
    }

    /**
     * Finds a product by ID.
     * @param id Product ID.
     * @return Optional containing the product if found.
     */
    public Optional<Product> findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    /**
     * Saves a new product.
     * @param product Product to save.
     * @return Saved product.
     */
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    /**
     * Deletes a product by ID.
     * @param id Product ID.
     */
    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
