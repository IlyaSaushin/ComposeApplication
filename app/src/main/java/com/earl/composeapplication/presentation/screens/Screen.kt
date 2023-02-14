package com.earl.composeapplication.presentation.screens

import androidx.annotation.StringRes
import com.earl.composeapplication.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Login: Screen("login", R.string.login)
    object Articles: Screen("articles", R.string.articles)
    object ConcreteArticle: Screen("concreteArticle", R.string.concreteArticle)
}
