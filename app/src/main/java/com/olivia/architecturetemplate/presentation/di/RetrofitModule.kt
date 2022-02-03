package com.olivia.architecturetemplate.presentation.di

import com.olivia.architecturetemplate.data.retrofit.api.SearchUserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * My Architecture template
 * Retrofit module
 * @author leesoyoung
 * @since 2021/12/29
 */

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Provides
    @Singleton
    fun provideSearchUserApi(): SearchUserApi = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(SearchUserApi::class.java)
}