package com.akash.d4cshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.akash.d4cshop.ui.screens.ShopFlowScreen
import com.akash.d4cshop.ui.theme.D4CShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            D4CShopTheme {
            ShopFlowScreen()
            }
        }
    }
}

