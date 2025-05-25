
package com.akash.d4cshop.data.repository

import com.akash.d4cshop.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.akash.d4cshop.data.Category
import com.akash.d4cshop.data.Product


class ShopRepository {

    fun getCategories(): List<Category> = listOf(
        Category("Cleansers", R.drawable.categorysample),
        Category("Toner", R.drawable.categorysample),
        Category("Serums", R.drawable.categorysample),
        Category("Moisturizers", R.drawable.categorysample),
        Category("Sunscreen", R.drawable.categorysample)
    )


    fun getProducts(): List<Product> = listOf(
        Product(
            id = 1,
            name = "clencera",
            brand = "clencera",
            description1 = "French clay and algae-powered cleanser",
            description2 = "Skin Tightness • Dry & Dehydrated Skin",
            price = 355.20,
            originalPrice = 444.00,
            rating = 4.5f,
            reviewCount = 249,
            isBestSeller = true,
            isInStock = true,
            image = R.drawable.product_image
        ),
        Product(
            id = 2,
            name = "glow",
            brand = "glow",
            description1 = "French clay and algae-powered cleanser",
            description2 = "Skin Tightness • Dry & Dehydrated Skin",
            price = 355.20,
            originalPrice = 444.00,
            rating = 4.5f,
            reviewCount = 249,
            isInStock = true,
            image = R.drawable.product_image
        ),
        Product(
            id = 3,
            name = "afterglow",
            brand = "afterglow",
            description1 = "French clay and algae-powered cleanser",
            description2 ="Skin Tightness • Dry & Dehydrated Skin",
            price = 355.20,
            originalPrice = 444.00,
            rating = 4.5f,
            reviewCount = 249,
            isInStock = false,
            image = R.drawable.product_image
        ),
    )
}