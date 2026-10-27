package com.huy.sportwear_shop.domain.product;
import java.math.BigDecimal;

public record Product(
        String id,
        String name,
        BigDecimal price
) {
}