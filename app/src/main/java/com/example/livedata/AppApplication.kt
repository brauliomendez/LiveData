package com.example.livedata

import android.app.Application
import com.example.livedata.di.Dagger

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Dagger.buildAppComponent(this)
    }

}