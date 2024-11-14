package com.coherentsolutions.advanced.java.restapi.exceptions;

/**
 * Custom exception thrown when a product is not found.
 */
public class ProductNotFoundException extends RuntimeException {

    /**
     * Constructs a new ProductNotFoundException.
     * @param id The product ID that was not found.
     */
    public ProductNotFoundException(Long id) {
        super("Product not found with id: " + id);
    }
}
