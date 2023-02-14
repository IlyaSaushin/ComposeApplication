package com.earl.composeapplication.screens

import android.os.Parcelable
import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.parcelize.Parcelize

@Parcelize
data class Word(val value: String) : Parcelable

@Composable
fun DetailsScreen(
    details: String
) {
    Scaffold {
        Text("Details screen from -> $details", modifier = Modifier.padding(30.dp))
    }
}