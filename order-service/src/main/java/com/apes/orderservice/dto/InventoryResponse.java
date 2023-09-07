package com.apes.orderservice.dto;

public record InventoryResponse(
        String skuCode,
        Boolean isInStock
) {

}
