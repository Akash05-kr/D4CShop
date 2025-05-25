package com.akash.d4cshop.ui.screens

import androidx.compose.foundation.Image
import com.akash.d4cshop.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akash.d4cshop.data.Category
import com.akash.d4cshop.data.Product
import com.akash.d4cshop.ui.viewmodels.ShopViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopFlowScreen(viewModel: ShopViewModel = ShopViewModel()) {

    val categories = viewModel.categories
    val products = viewModel.products
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.5f))
    ) {
        TopAppBar(
            title = {
                Text(
                    text = stringResource(R.string.shop),
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FontFamily(
                        Font(R.font.century_old_style_std_bold)
                    )
                )
            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.back),
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = stringResource(R.string.search),
                        tint = Color.White
                    )
                }
                IconButton(onClick = { }) {
                    Box {
                        Icon(
                            Icons.Default.FavoriteBorder,
                            contentDescription = stringResource(R.string.favorites),
                            tint = Color.White
                        )
                        Badge(
                            modifier = Modifier.offset(x = (12).dp, y = (10).dp),
                            containerColor = Color(0xFF4CAF50)
                        ) {
                            Text("2", fontSize = 10.sp)
                        }
                    }
                }
                IconButton(onClick = { }) {
                    Box {
                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = stringResource(R.string.cart),
                            tint = Color.White
                        )
                        Badge(
                            modifier = Modifier.offset(x =12.dp, y = (10).dp),
                            containerColor = Color(0xFF4CAF50)
                        ) {
                            Text("3", fontSize = 10.sp)
                        }
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Black.copy(alpha = 0.5f),
            )
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f)),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),

        ) {
            // Promotional Banner
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(225.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.shopflowcard1),
                        contentDescription = stringResource(R.string.promotional_banner),
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(16.dp)),
                        contentScale = ContentScale.Crop
                    )
                    Row( modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxWidth(0.4f)
                        .align(Alignment.BottomStart)
                        .padding(start = 54.dp),
                       
                    ) {
                        Box(
                            modifier = Modifier

                                .padding(2.dp)
                                .size(32.dp, 12.dp)
                                .background(Color(0xFF4CAF50), shape = RoundedCornerShape(8.dp))
                        )
                        Box(
                            modifier = Modifier
                                .padding(2.dp)
                                .size(32.dp, 12.dp)
                                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                        )
                        Box(
                            modifier = Modifier
                                .padding(2.dp)
                                .size(40.dp, 12.dp)
                                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp, start = 40.dp, end = 60.dp, bottom = 55.dp),
                    ) {
                        Column {
                            Text(
                                text = stringResource(R.string.get_20_off),
                                color = Color.White,
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = stringResource(R.string.get_20_off_),
                                color = Color.White.copy(alpha = 0.8f),
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.height(32.dp))
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = Color(0xFF4CAF50)
                            ) {
                                Text(
                                    text = stringResource(R.string._12_16_october),
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.image),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier
                                .size(36.dp)
                                .align(Alignment.BottomEnd)
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                    }
                }

            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.categories),
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily(
                            Font(R.font.century_old_style_std_bold)
                        ),
                        modifier = Modifier.padding(start = 8.dp)

                    )
                    TextButton(onClick = { }) {
                        Text(
                            text = stringResource(R.string.see_all),
                            color = Color.Gray,
                            fontSize = 14.sp,
                            textDecoration = TextDecoration.Underline
                            
                        )
                    }
                }
            }

            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(horizontal = 4.dp)
                ) {
                    items(categories) { category ->
                        CategoryItem(category = category)
                    }
                }
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.new_products),
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily(
                            Font(R.font.century_old_style_std_bold)
                        ),
                       modifier = Modifier.padding(start = 8.dp)
                    )
                    TextButton(onClick = { }) {
                        Text(
                            text = stringResource(R.string.see_all),
                            color = Color.Gray,
                            fontSize = 14.sp,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
            }
            items(products) { product ->
                ProductCard(product = product)
            }
        }
    }
}

@Composable
fun CategoryItem(category: Category) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Surface(
            modifier = Modifier.size(80.dp),
            shape = CircleShape,
            color =Color.Black
        ) {
            category.imageRes?.let { imageRes ->
              Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = category.name,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                )
            }
        }
        Text(
            text = category.name,
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun ProductCard(product: Product) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
     
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp)
                .paint(
                    painter = painterResource(id = R.drawable.product_bg_card),
                    contentScale = ContentScale.FillBounds
                )
        ) {
          
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .padding(20.dp),
                contentAlignment = Alignment.Center
            ) {
                if (product.image != null) {
                    Image(
                        painter = painterResource(id = product.image),
                        contentDescription = product.name,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(R.string.no_image),
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
            
                Surface(
                    onClick = { },
                    shape = CircleShape,
                    color = Color.Black,
                    modifier = Modifier.size(40.dp)
                ) {
                    Icon(
                        Icons.Default.FavoriteBorder,
                        contentDescription = stringResource(R.string.add_to_favorites),
                        tint = Color(0xFF605DD3),
                        modifier = Modifier.padding(8.dp)
                    )
                }

               
                if (product.isBestSeller) {
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.best_seller),
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp),
                            color = Color(0xFF4CAF50),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }

        
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .offset(y = (-20).dp)
                .paint(
                    painter = painterResource(id = R.drawable.product_title_card),
                    contentScale = ContentScale.FillBounds
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
               
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = product.brand,
                        color = Color(0xFF4CAF50),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(
                            Font(R.font.tangerine)
                        )
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(
                                    if (product.isInStock) Color(0xFF4CAF50) else Color.Red,
                                    CircleShape
                                )
                        )
                        Text(
                            text = if (product.isInStock) stringResource(R.string.in_stock) else stringResource(
                                R.string.out_of_stock
                            ),
                            color = if (product.isInStock) Color(0xFF4CAF50) else Color.Red,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = product.description1,
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
                Text(
                    text = product.description2,
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Spacer(modifier = Modifier.height(16.dp))

              
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "RS. ${product.price}",
                                color = Color(0xFF605DD3),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "RS. ${product.originalPrice}",
                                color = Color.Gray,
                                fontSize = 16.sp,
                                textDecoration = TextDecoration.LineThrough
                            )
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            repeat(5) { index ->
                                Icon(
                                    if (index < product.rating.toInt()) Icons.Default.Star else Icons.Default.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFFC107),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            Text(
                                text = "${product.reviewCount} reviews",
                                color = Color.White,
                                fontSize = 12.sp,
                                textDecoration = TextDecoration.Underline,
                                fontFamily = FontFamily(
                                    Font(R.font.neuzeitsbook , FontWeight.Normal, FontStyle.Normal)
                                )
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = (20).dp, y = (10).dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = Color.Transparent,
                            modifier = Modifier
                                .size(56.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFF4CAF50),
                                    shape = CircleShape
                                )
                        ) {
                            Icon(
                                Icons.Default.ShoppingCart,
                                contentDescription = stringResource(R.string.add_to_cart),
                                tint = Color(0xFF4CAF50),
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                        }
                    }

                }
            }
        }
    }

