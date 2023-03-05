package com.earl.domain

import javax.inject.Inject

interface Interactor {

    class Base @Inject constructor(
        private val repository: Repository
    ) : Interactor {

    }
}