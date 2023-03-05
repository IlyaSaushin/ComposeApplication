package com.earl.composeapplication.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.earl.composeapplication.R
import com.earl.composeapplication.presentation.models.ArticlePresentation
import com.earl.composeapplication.presentation.ui.theme.backgroundColor
import com.earl.composeapplication.presentation.ui.theme.uppBarColor

@Composable
fun ArticlesScreen(
    navigate: (String) -> Unit
) {
    val list = listOf(
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
        ArticlePresentation(0, "title", "section", "abstract", "link", "date", "picture"),
    )
    Scaffold(
        backgroundColor = backgroundColor
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
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
            LazyColumn {
                list.map { item { ArticleListItem(it, navigate) } }
            }
        }
    }
}