package com.coherentsolutions.advanced.java.restapi.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Represents a product with an id, name, and price.
 */
public class Product {

    private Long id;

    @NotBlank(message = "Product name is mandatory")
    private String name;

    @NotNull(message = "Price is mandatory")
    @Min(value = 0, message = "Price must be positive")
    private Double price;

    // Constructors

    /**
     * Default constructor.
     */
    public Product() {
    }

    /**
     * Parameterized constructor.
     * @param id Product ID.
     * @param name Product Name.
     * @param price Product Price.
     */
    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    /**
     * Gets the product ID.
     * @return Product ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the product ID.
     * @param id Product ID.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the product name.
     * @return Product Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     * @param name Product Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the product price.
     * @return Product Price.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the product price.
     * @param price Product Price.
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}
