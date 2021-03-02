package com.example.healtfood.web.model;

import com.example.healtfood.entity.Product;

import java.util.Set;

public class CartDto {
    private Long id;
    private Set<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
