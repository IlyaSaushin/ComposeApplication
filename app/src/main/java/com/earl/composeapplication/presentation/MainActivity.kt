package com.earl.composeapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.earl.composeapplication.presentation.screens.ArticlesScreen
import com.earl.composeapplication.presentation.screens.LoginScreen
import com.earl.composeapplication.presentation.screens.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) { LoginScreen { dest -> navController.navigate(dest) } }
        composable(Screen.Articles.route) { ArticlesScreen { dest -> navController.navigate(dest) } }
    }
}