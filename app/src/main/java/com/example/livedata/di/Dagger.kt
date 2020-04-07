package com.example.livedata.di

import android.app.Application

object Dagger {

    lateinit var appComponent: AppComponent

    fun buildAppComponent(application: Application) {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(application))
            .build()
    }

}