package com.earl.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            testCompose()
            listItem()
        }
    }
}

@Composable
fun testCompose() {
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Hello")
            Text(text = "World")
            Text(text = "!!!")
        }
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Text(text = "Hello")
            Text(text = "World")
            Text(text = "!!!")
        }
        Row(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Hello")
            Text(text = "World")
            Text(text = "!!!")
        }
    }
}

@Preview
@Composable
fun listItem() {
    Card(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .padding(10.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(Color.Gray),
                )
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "SOME TEXT", Modifier.padding(bottom = 5.dp))
                    Text(text = "SOME TEXT", Modifier.padding(top = 5.dp))
                }
            }
        }
    }
}