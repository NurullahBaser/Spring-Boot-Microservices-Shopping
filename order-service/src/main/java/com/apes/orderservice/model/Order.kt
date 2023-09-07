package com.apes.orderservice.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "t_orders")
data class Order @JvmOverloads constructor(

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id : String? = "",
        val orderNumber: String = UUID.randomUUID().toString(),
        @OneToMany(cascade = [CascadeType.ALL])
        val orderLineItemsList: List<OrderLineItems> = mutableListOf()
) {
}
