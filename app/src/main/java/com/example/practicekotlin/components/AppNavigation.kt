package com.example.practicekotlin.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicekotlin.screens.HomeScreen
import com.example.practicekotlin.screens.LoginScreen

@Composable
fun AppNavigator(){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = "home") {
        composable("home"){
            HomeScreen(navController)
        }
        composable("login"){
            LoginScreen(navController)
        }
    }
}