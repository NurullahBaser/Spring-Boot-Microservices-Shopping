package com.apes.inventoryservice.model

import jakarta.persistence.*

@Entity
@Table(name = "t_inventory")
data class Inventory @JvmOverloads constructor(

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id : String? = "",
        val skuCode : String,
        val quantity: Int
) {

}
