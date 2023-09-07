package com.apes.productservice.dto;

import com.apes.productservice.model.Product;

import java.math.BigDecimal;

public record ProductResponse(
        String id,
        String name,
        String description,
        BigDecimal price
) {

    public static ProductResponse convert(Product from) {
        return new ProductResponse(from.getId(),
                from.getName(),
                from.getDescription(),
                from.getPrice());
    }
}
