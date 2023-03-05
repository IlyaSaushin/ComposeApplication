package com.earl.composeapplication.presentation

import androidx.lifecycle.ViewModel
import com.earl.domain.Interactor
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val interactor: Interactor
) : ViewModel() {

}