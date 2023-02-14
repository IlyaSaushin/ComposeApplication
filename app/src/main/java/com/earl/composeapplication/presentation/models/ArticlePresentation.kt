package com.earl.composeapplication.presentation.models

interface ArticlePresentation {

    class Base(
        private val id: Int,
        private val title: String,
        private val section: String,
        private val abstract: String,
        private val link: String,
        private val date: String,
        private val picture: String
    ) : ArticlePresentation {

    }
}