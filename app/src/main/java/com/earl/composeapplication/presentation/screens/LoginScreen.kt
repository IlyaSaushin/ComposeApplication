package com.earl.composeapplication.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.earl.composeapplication.R
import com.earl.composeapplication.presentation.ui.theme.backgroundColor
import com.earl.composeapplication.presentation.ui.theme.uppBarColor

@Composable
fun LoginScreen(
    navigate: (String) -> Unit
) {
    var loginText by remember { mutableStateOf("") }
    var passwordText by remember { mutableStateOf("") }
    val colorStops = arrayOf(
        0.0f to Color.Yellow,
        0.2f to Color.Red,
        1f to Color.Blue
    )
    val rainbowColors = listOf(Color.Blue, Color.Cyan, Color.Gray, Color.Red, Color.Black)
    val brush = remember {
        Brush.linearGradient(
            colors = rainbowColors
        )
    }
    Scaffold(
        backgroundColor = backgroundColor
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(uppBarColor)
                .height(40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(R.string.nyt), fontSize = 20.sp)
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                modifier = Modifier
                    .padding(vertical = 15.dp),
                value = loginText,
                onValueChange = {
                    loginText = it
                },
                label = { Text(text = stringResource(R.string.log)) }
            )
            TextField(
                modifier = Modifier
                    .padding(vertical = 15.dp),
                value = passwordText,
                onValueChange = {
                    passwordText = it
                },
                label = { Text(text = stringResource(R.string.password)) },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(vertical = 15.dp),
                onClick = {
                    navigate.invoke(Screen.Articles.route)
                }
            ) {
                Text(text = stringResource(id = R.string.log))
            }
        }
    }
}