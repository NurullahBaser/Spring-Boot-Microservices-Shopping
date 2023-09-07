package com.apes.orderservice.model

import com.apes.orderservice.dto.OrderLineItemsDto
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "t_order_line_items")
data class OrderLineItems(

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id: String,
        val skuCode: String,
        val price : BigDecimal,
        val quantity: Int
) {
        companion object {
                @JvmStatic
                fun convert(from: OrderLineItemsDto): OrderLineItems {
                        return OrderLineItems(
                                from.id,
                                from.skuCode,
                                from.price,
                                from.quantity
                        )
                }
        }
}
