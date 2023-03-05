package com.earl.composeapplication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.earl.composeapplication.R
import com.earl.composeapplication.presentation.models.ArticlePresentation

@Composable
fun ArticleListItem(
    article: ArticlePresentation,
    navigate: (String) -> Unit
) {
    var title by remember { mutableStateOf("title") }
    val section by remember { mutableStateOf("section:") }
    val abstract by remember { mutableStateOf("abstract:") }
    val date by remember { mutableStateOf("date:") }

    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .padding(vertical = 12.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
            ) {
                Text(text = article.title, modifier = Modifier.padding(8.dp), fontSize = 22.sp)
                Row {
                    Text(text = article.section, modifier = Modifier.padding(8.dp), fontSize = 14.sp)
                    Text(text = article.abstract, modifier = Modifier.padding(8.dp), fontSize = 14.sp)
                }
                Text(text = article.date, modifier = Modifier.padding(8.dp), fontSize = 14.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "image",
                modifier = Modifier
                    .padding(end = 24.dp)
            )
        }
    }
}