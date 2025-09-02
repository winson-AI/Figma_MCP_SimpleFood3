package com.example.simplefood3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import org.jetbrains.compose.resources.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import simplefood3.composeapp.generated.resources.Res
import simplefood3.composeapp.generated.resources.cheese_burger
import simplefood3.composeapp.generated.resources.chicken_burger
import simplefood3.composeapp.generated.resources.comment
import simplefood3.composeapp.generated.resources.filter
import simplefood3.composeapp.generated.resources.user
import simplefood3.composeapp.generated.resources.fried_chicken_burger
import simplefood3.composeapp.generated.resources.heart
import simplefood3.composeapp.generated.resources.home
import simplefood3.composeapp.generated.resources.profile_avatar
import simplefood3.composeapp.generated.resources.search
import simplefood3.composeapp.generated.resources.star
import simplefood3.composeapp.generated.resources.veggie_burger
import simplefood3.composeapp.generated.resources.icon_add
import simplefood3.composeapp.generated.resources.shadow_ellipse
import simplefood3.composeapp.generated.resources.dot

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 90.dp) // Space for bottom navigation
            ) {
                // Header - exact positioning from Figma
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 19.dp)
                        .padding(top = 28.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Foodgo",
                            style = TextStyle(
                                fontSize = 45.sp,
                                fontFamily = FontFamily.Cursive, // Lobster font approximation
                                color = Color(0xFF3C2F2F),
                                fontWeight = FontWeight.Normal
                            )
                        )
                        Text(
                            text = "Order your favourite food!",
                            style = TextStyle(
                                fontSize = 18.sp, 
                                color = Color(0xFF6A6A6A),
                                fontWeight = FontWeight.Medium
                            ),
                            modifier = Modifier.padding(top = 0.dp)
                        )
                    }
                    
                    Image(
                        painter = painterResource(Res.drawable.profile_avatar),
                        contentDescription = "Profile",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }

                // Search Bar and Filter
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 19.dp)
                        .height(60.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Search Bar
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .height(60.dp)
                            .shadow(4.dp, RoundedCornerShape(20.dp), spotColor = Color.Black.copy(alpha = 0.15f))
                            .background(Color.White, RoundedCornerShape(20.dp))
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.search),
                            contentDescription = "Search",
                            tint = Color(0xFF3C2F2F),
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Text(
                            "Search", 
                            color = Color(0xFF3C2F2F), 
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    
                    // Filter Button
                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .background(Color(0xFFEF2A39), RoundedCornerShape(20.dp))
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.filter),
                            contentDescription = "Filter",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(41.dp))

                // Categories
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                        .padding(horizontal = 19.dp),
                    horizontalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    CategoryButton("All", selected = true)
                    CategoryButton("Combos")
                    CategoryButton("Sliders")
                    CategoryButton("Classic")
                }
                
                Spacer(modifier = Modifier.height(41.dp))

                // Food Grid
                Column(
                    modifier = Modifier.padding(horizontal = 19.dp),
                    verticalArrangement = Arrangement.spacedBy(31.dp)
                ) {
                    // First Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(22.dp)
                    ) {
                        BurgerCard(
                            image = Res.drawable.cheese_burger,
                            title = "Cheeseburger",
                            subtitle = "Wendy's Burger",
                            rating = "4.9",
                            modifier = Modifier.weight(1f)
                        )
                        BurgerCard(
                            image = Res.drawable.veggie_burger,
                            title = "Hamburger",
                            subtitle = "Veggie Burger",
                            rating = "4.8",
                            modifier = Modifier.weight(1f)
                        )
                    }
                    
                    // Second Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(22.dp)
                    ) {
                        BurgerCard(
                            image = Res.drawable.chicken_burger,
                            title = "Hamburger",
                            subtitle = "Chicken Burger",
                            rating = "4.6",
                            modifier = Modifier.weight(1f)
                        )
                        BurgerCard(
                            image = Res.drawable.fried_chicken_burger,
                            title = "Hamburger",
                            subtitle = "Fried Chicken Burger",
                            rating = "4.5",
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(40.dp))
            }

            // Bottom Navigation
            BottomNavigation(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }
}

@Composable
fun CategoryButton(text: String, selected: Boolean = false) {
    ElevatedButton(
        onClick = { },
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = if (selected) Color(0xFFEF2A39) else Color(0xFFF5F5F5),
            contentColor = if (selected) Color.White else Color(0xFF6A6A6A)
        ),
        modifier = Modifier
            .height(50.dp),
        elevation = if (selected) ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 6.dp
        ) else ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 0.dp
        )
    ) {
        Text(
            text, 
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun BurgerCard(
    image: DrawableResource, 
    title: String, 
    subtitle: String,
    rating: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .width(185.dp)
            .height(225.dp)
            .shadow(6.dp, RoundedCornerShape(20.dp), spotColor = Color.Black.copy(alpha = 0.13f))
            .background(Color.White, RoundedCornerShape(20.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(11.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Food Image
            Box(
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                // Shadow ellipse
                Image(
                    painter = painterResource(Res.drawable.shadow_ellipse),
                    contentDescription = null,
                    modifier = Modifier
                        .width(91.dp)
                        .height(11.dp)
                        .offset(y = 55.dp),
                    alpha = 0.3f
                )
                
                Image(
                    painter = painterResource(image),
                    contentDescription = title,
                    modifier = Modifier
                        .size(120.dp),
                    contentScale = ContentScale.Fit
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Title and Subtitle
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                // Title with proper styling from Figma
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 16.sp, 
                        fontWeight = if (title == "Cheeseburger") FontWeight.SemiBold else FontWeight.Bold,
                        color = if (title == "Cheeseburger") Color(0xFF481FCD) else Color(0xFF3C2F2F)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                // Subtitle with proper styling
                Text(
                    text = subtitle,
                    style = TextStyle(
                        fontSize = 16.sp, 
                        fontWeight = FontWeight.Normal, 
                        color = Color(0xFF3C2F2F)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Rating
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(Res.drawable.star), 
                    contentDescription = "Star", 
                    tint = Color(0xFFFF9633), 
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    rating, 
                    fontSize = 16.sp, 
                    color = Color(0xFF3C2F2F),
                    fontWeight = FontWeight.Medium
                )
            }
        }
        
        // Heart Icon
        Icon(
            painter = painterResource(Res.drawable.heart),
            contentDescription = "Favorite",
            tint = Color(0xFF3C2F2F),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(15.dp)
                .size(24.dp)
                .clickable { }
        )
    }
}

@Composable
fun BottomNavigation(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        // Bottom navigation background - matching Figma's curved design
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(
                    Color(0xFFEF2A39), 
                    RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)
                )
        )
        
        // Navigation Icons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 31.dp)
                .padding(top = 16.dp, bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(Res.drawable.home), 
                contentDescription = "Home", 
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            
            // Create a simple user icon since user.xml doesn't exist
            Icon(
                painter = painterResource(Res.drawable.user),
                contentDescription = "User",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            
            // Center space for floating action button
            Spacer(modifier = Modifier.width(72.dp))
            
            Icon(
                painter = painterResource(Res.drawable.comment), 
                contentDescription = "Comment", 
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            
            Icon(
                painter = painterResource(Res.drawable.heart), 
                contentDescription = "Heart", 
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        
        // Floating Add Button with better positioning
        Box(
            modifier = Modifier
                .size(72.dp)
                .offset(y = (-36).dp)
                .shadow(8.dp, CircleShape)
                .background(Color(0xFFEF2A39), CircleShape)
                .align(Alignment.TopCenter)
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(Res.drawable.icon_add), 
                contentDescription = "Add", 
                tint = Color.White, 
                modifier = Modifier.size(32.dp)
            )
        }
        
        // Small indicator dot - positioned like in Figma
        Box(
            modifier = Modifier
                .size(4.dp)
                .background(Color.White, CircleShape)
                .align(Alignment.BottomStart)
                .offset(x = 41.dp, y = (-17).dp)
        )
    }
}