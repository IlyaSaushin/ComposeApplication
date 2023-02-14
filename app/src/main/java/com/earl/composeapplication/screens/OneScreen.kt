package com.earl.composeapplication.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OneScreen(
    navigate: (String) -> Unit
) {
    val testArray = listOf(Word("one"), Word("two"), Word("three"), Word("four"), Word("five"), Word("six"), Word("seven"), Word("eight"), Word("nine"), Word("ten"), Word("one"), Word("two"), Word("three"), Word("four"), Word("five"), Word("six"), Word("seven"), Word("eight"), Word("nine"), Word("ten"))
    Scaffold  {
        LazyColumn {
            testArray.map {
                item {
                    Text(it.value, modifier = Modifier.padding(24.dp).fillMaxWidth().clickable {
                        navigate.invoke("detailsScreen/{details}".replace(
                            oldValue = "{details}",
                            newValue = "${it.value}"))
                    })
                }
            }
        }
    }
}