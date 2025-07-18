package com.example.practicekotlin
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight.Companion.W200
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicekotlin.components.AppNavigator
import com.example.practicekotlin.components.CardComponent
import com.example.practicekotlin.screens.HomeScreen
import com.example.practicekotlin.screens.LoginScreen
import com.example.practicekotlin.ui.theme.PracticekotlinTheme

class MainActivity : ComponentActivity() {
    var sendIntent = Intent(Intent.ACTION_SEND)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // change the status bar color here
        window.statusBarColor = android.graphics.Color.parseColor("#6A11CB")
        setContent {
//            val navController= rememberNavController()
//            NavHost(navController = navController, startDestination = "home") {
//                composable("home") { HomeScreen(navController) }
//                composable("login") { LoginScreen(navController) }
//            }
            PracticekotlinTheme {
                AppNavigator()
            }
        }
    }
}

//@Composable
//fun LoginScreen() {
//    val gradientBrush = Brush.verticalGradient(
//        colors = listOf(Color(0xFF6A11CB), Color(0xFF2575FC))
//    )
//
//    Box( // This is the parent container
//        modifier = Modifier
//            .fillMaxSize()
//            .background(gradientBrush)
//    ) {
//        // top section 1st
//        val padding = 16.dp
//        Column(
//            modifier = Modifier
//                .padding(padding)
//                .fillMaxWidth()
//                .clip(RoundedCornerShape(16.dp))
//                .align(Alignment.TopStart) // 👈 position it at the top
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .background(Color.White)
//                    .fillMaxWidth()
//                    .height(46.dp)
//                    .clip(RoundedCornerShape(16.dp)),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Icon(
//                    imageVector = Icons.Filled.Home,
//                    contentDescription = "Home Icon",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .padding(start = 8.dp)
//                )
//                Icon(
//                    imageVector = Icons.Filled.Menu,
//                    contentDescription = "Menu Icon",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .padding(end = 8.dp)
//                )
//            }
//        }
//
//        // 2nd middle
//        Column(
//            modifier = Modifier
//                .padding(padding)
//                .fillMaxWidth()
//                .clip(RoundedCornerShape(16.dp))
//                .align(Alignment.Center) // 👈 position it at the top
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .background(Color.White)
//                    .fillMaxWidth()
//                    .height(46.dp)
//                    .clip(RoundedCornerShape(16.dp)),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    CardComponent()
//                }
//            }
//        }
//
//        // bottom section
//        Column(
//            modifier = Modifier
//                .padding(top = 64.dp)
//                .fillMaxWidth()
//                .clip(RoundedCornerShape(16.dp))
//                .align(Alignment.BottomEnd) // 👈 position it at the bottom
//        )
//        {
//            Row(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .background(Color.White)
//                    .fillMaxWidth()
//                    .height(46.dp)
//                    .clip(RoundedCornerShape(16.dp)),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                Icon(
//                    imageVector = Icons.Filled.Home,
//                    contentDescription = "Home Icon",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .padding(start = 8.dp)
//                )
//                Icon(
//                    imageVector = Icons.Filled.Menu,
//                    contentDescription = "Menu Icon",
//                    modifier = Modifier
//                        .size(32.dp)
//                        .padding(end = 8.dp)
//                )
//            }
//
//
//        }
//    }
//}

fun Button(function: () -> Unit): Button {
    TODO("Not yet implemented")
}
//
//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    PracticekotlinTheme {
//        LoginScreen(nav)
//    }
//}
