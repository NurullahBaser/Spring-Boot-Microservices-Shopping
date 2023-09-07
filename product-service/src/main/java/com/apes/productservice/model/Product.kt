package com.apes.productservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document(value = "product")
data class Product @JvmOverloads constructor(
    @Id
    val id : String? = "",
    val name: String,
    val description: String,
    val price : BigDecimal
)
