package com.huy.sportwear_shop.application.product.service;

import com.huy.sportwear_shop.application.product.ProductRepository;
import com.huy.sportwear_shop.domain.product.Product;

import java.util.List;

public class GetProductsService {

    private final ProductRepository productRepository;

    public GetProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> execute() {
        return productRepository.findAll();
    }
}