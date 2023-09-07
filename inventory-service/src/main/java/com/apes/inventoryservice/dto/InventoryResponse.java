package com.apes.inventoryservice.dto;

import com.apes.inventoryservice.model.Inventory;

public record InventoryResponse(
        String skuCode,
        Boolean isInStock
) {

    public static InventoryResponse convert(Inventory from) {
        return new InventoryResponse(
                from.getSkuCode(),
                from.getQuantity()>0
        );
    }

}
