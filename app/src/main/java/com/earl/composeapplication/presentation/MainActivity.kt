package com.earl.composeapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.earl.composeapplication.presentation.screens.ArticlesScreen
import com.earl.composeapplication.presentation.screens.LoginScreen
import com.earl.composeapplication.presentation.screens.Screen
import com.earl.composeapplication.presentation.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            App()
            ComposeApplicationTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {
                    SuminLesson()
                }
            }
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

@Preview
@Composable
fun SuminLesson() {
    Card(
        modifier = Modifier
            .padding(8.dp),
        backgroundColor = MaterialTheme.colors.background,
        shape = RoundedCornerShape(
            topEnd = 10.dp,
            topStart = 10.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    modifier = Modifier
                        .size(25.dp),
                    painter = painterResource(id = com.earl.composeapplication.R.drawable.instagram),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
                InstDetailsText(number = "6,950", value = "Posts")
                InstDetailsText(number = "436M", value = "Followers")
                InstDetailsText(number = "76", value = "Following")
            }
            Text(
                modifier = Modifier
                    .padding(start = 10.dp, top = 20.dp),
                text = "Instagram",
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(start = 10.dp),
                text = "#YoursToMake",
                fontSize = 13.sp,
                fontFamily = FontFamily.Serif,
            )
            Text(
                modifier = Modifier
                    .padding(start = 10.dp),
                text = "www.facebook.com/",
                fontSize = 13.sp,
                fontFamily = FontFamily.Serif,
            )
            Button(
                modifier = Modifier
                    .padding(start = 10.dp),
                onClick = {  }
            ) {
                Text(

                    text = "Follow",
                    fontFamily = FontFamily.Serif
                )
            }
        }
    }
}

@Composable
private fun InstDetailsText(number: String, value: String) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = number,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Light,
            fontSize = 18.sp
        )
        Text(
            text = value,
            fontFamily = FontFamily.Serif,
            fontSize = 13.sp
        )
    }
}