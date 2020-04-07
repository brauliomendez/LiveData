package com.example.livedata.di

import android.app.Application
import com.example.livedata.ServiceApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
class AppModule(application: Application) {

    @Provides
    fun serviceApi(retrofit: Retrofit): ServiceApi {
        return retrofit.create(ServiceApi::class.java)
    }

    @Provides
    fun retrofit(): Retrofit {
        val client = OkHttpClient.Builder()
            .build()

        return Retrofit.Builder()
            .client(client)
            .baseUrl("")
            .build()
    }

}