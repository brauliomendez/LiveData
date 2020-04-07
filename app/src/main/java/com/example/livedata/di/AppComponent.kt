package com.example.livedata.di

import com.example.livedata.ServiceApi
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun serviceApi(): ServiceApi

}