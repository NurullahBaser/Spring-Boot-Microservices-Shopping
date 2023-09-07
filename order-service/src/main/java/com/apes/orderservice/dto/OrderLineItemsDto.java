package com.apes.orderservice.dto;

import java.math.BigDecimal;

public record OrderLineItemsDto(
        String id,
        String skuCode,
        BigDecimal price,
        Integer quantity
) {
}
