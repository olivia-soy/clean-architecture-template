package com.olivia.architecturetemplate.presentation.di

import com.olivia.architecturetemplate.data.datasource.local.MyLocalDataSource
import com.olivia.architecturetemplate.data.datasource.local.MyLocalDataSourceImpl
import com.olivia.architecturetemplate.data.datasource.remote.MyRemoteDataSource
import com.olivia.architecturetemplate.data.datasource.remote.MyRemoteDataSourceImpl
import com.olivia.architecturetemplate.data.repositoryImpl.MyRepositoryImpl
import com.olivia.architecturetemplate.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * My archictecture  template
 * NetworkModule
 * @author leesoyoung
 * @since 2021/12/28
 */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    fun providesMyRepository(myRepository: MyRepositoryImpl): MyRepository {
        return myRepository
    }

    @Provides
    fun providesMyLocalDataSource(myLocalDataSource: MyLocalDataSourceImpl): MyLocalDataSource {
        return myLocalDataSource
    }

    @Provides
    fun providesMyRemoteDataSource(myRemoteDataSource: MyRemoteDataSourceImpl): MyRemoteDataSource {
        return myRemoteDataSource
    }
}