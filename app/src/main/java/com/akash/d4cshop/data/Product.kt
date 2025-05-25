package com.akash.d4cshop.data

data class Product(
    val id: Int,
    val name: String,
    val brand: String,
    val description1: String,
    val description2: String,
    val price: Double,
    val originalPrice: Double,
    val rating: Float,
    val reviewCount: Int,
    val isBestSeller: Boolean = false,
    val isInStock: Boolean = true,
    val image: Int? = null
)

