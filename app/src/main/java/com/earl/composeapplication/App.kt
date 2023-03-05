package com.earl.composeapplication

import android.app.Application
import com.earl.composeapplication.di.DaggerAppComponent

class App : Application() {

    val appComponent = DaggerAppComponent.create()
}