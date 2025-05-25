package com.akash.d4cshop.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.akash.d4cshop.data.repository.ShopRepository

class ShopViewModel(private val repository: ShopRepository = ShopRepository()) : ViewModel() {
    // Expose the data to the UI
    val categories = repository.getCategories()
    val products = repository.getProducts()
}