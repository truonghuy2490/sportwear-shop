package com.huy.sportwear_shop.product;

import com.huy.sportwear_shop.application.product.service.GetProductsService;
import com.huy.sportwear_shop.domain.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final GetProductsService getProductsService;

    public ProductController(GetProductsService getProductsService) {
        this.getProductsService = getProductsService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return getProductsService.execute();
    }
}