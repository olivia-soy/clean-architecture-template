package com.olivia.architecturetemplate.data.repositoryImpl

import com.olivia.architecturetemplate.data.datasource.local.MyLocalDataSource
import com.olivia.architecturetemplate.data.datasource.remote.MyRemoteDataSource
import com.olivia.architecturetemplate.data.entity.User
import com.olivia.architecturetemplate.data.mapper.toUserModel
import com.olivia.architecturetemplate.data.retrofit.response.SearchUserResponseData
import com.olivia.architecturetemplate.domain.model.UserModel
import com.olivia.architecturetemplate.domain.repository.MyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * architecture template
 * SearchUserRepository implement
 * @author leesoyoung
 * @since 2021/12/29
 */

class MyRepositoryImpl @Inject constructor(
    private val myLocalDataSource: MyLocalDataSource,
    private val myRemoteDataSource: MyRemoteDataSource
) : MyRepository {
    override fun observeList(searchWord: String?): Flow<List<UserModel>> =
        myLocalDataSource.getUserBySearchWordAsFlow(searchWord).map {
            it.map { user ->
                user.toUserModel()
            }
        }

    override suspend fun requestList(
        searchWord: String,
        page: Int
    ): SearchUserResponseData? {
        return myRemoteDataSource.getUserBySearchWord(searchWord, page)
    }

    override suspend fun insertUser(user: User) {
        myLocalDataSource.insertUser(user)
    }

    override suspend fun deleteUser(userId: Int) {
        myLocalDataSource.deleteById(userId)
    }
}