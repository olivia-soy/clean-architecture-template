package com.olivia.architecturetemplate.presentation.di

import android.content.Context
import androidx.room.Room
import com.olivia.architecturetemplate.data.entity.AppDatabase
import com.olivia.architecturetemplate.data.entity.dao.MyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * My Architecture template
 * DataBaseModule
 * @author leesoyoung
 * @since 2021/12/29
 */
@InstallIn(SingletonComponent::class)
@Module
object DataBaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, "AppDatabase.db")
        .build()

    @Singleton
    @Provides
    fun provideUserDao(appDatabase: AppDatabase): MyDao = appDatabase.UserDao()
}
 
 