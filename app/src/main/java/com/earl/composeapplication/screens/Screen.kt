package com.earl.composeapplication.screens

import androidx.annotation.StringRes
import com.earl.composeapplication.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object One : Screen("one", R.string.one)
    object Two : Screen("two", R.string.two)
    object Three : Screen("three", R.string.three)
    object Details: Screen("details", R.string.details)
}
