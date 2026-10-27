package com.huy.sportwear_shop.application.product;

import com.huy.sportwear_shop.domain.product.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();
}