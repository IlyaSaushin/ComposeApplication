package com.earl.composeapplication.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThreeScreen() {
    Scaffold(

    ) {
        Text("THREE SCREEN", modifier = Modifier.padding(30.dp))
    }
}