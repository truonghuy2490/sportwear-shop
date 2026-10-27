package com.huy.sportwear_shop.config;

import com.huy.sportwear_shop.application.product.ProductRepository;
import com.huy.sportwear_shop.application.product.service.GetProductsService;
import com.huy.sportwear_shop.infrastructure.persistence.product.InMemoryProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductRepository productRepository() {
        return new InMemoryProductRepository();
    }

    @Bean
    public GetProductsService getProductsService(
            ProductRepository productRepository) {
        return new GetProductsService(productRepository);
    }
}