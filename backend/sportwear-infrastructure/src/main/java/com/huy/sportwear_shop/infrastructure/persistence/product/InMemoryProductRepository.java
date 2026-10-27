package com.huy.sportwear_shop.infrastructure.persistence.product;

import com.huy.sportwear_shop.application.product.ProductRepository;
import com.huy.sportwear_shop.domain.product.Product;

import java.math.BigDecimal;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products = List.of(
            new Product("P001", "Running Shoes",
                    new BigDecimal("79.99")),
            new Product("P002", "Training T-Shirt",
                    new BigDecimal("24.99"))
    );

    @Override
    public List<Product> findAll() {
        return products;
    }
}