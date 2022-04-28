package com.olivia.architecturetemplate.data.repositoryImpl

import com.olivia.architecturetemplate.data.datasource.local.MyLocalDataSource
import com.olivia.architecturetemplate.data.datasource.remote.MyRemoteDataSource
import com.olivia.architecturetemplate.data.mapper.toSearchUserModel
import com.olivia.architecturetemplate.data.mapper.toUser
import com.olivia.architecturetemplate.data.mapper.toUserModel
import com.olivia.architecturetemplate.domain.model.SearchUserModel
import com.olivia.architecturetemplate.domain.model.UserModel
import com.olivia.architecturetemplate.domain.repository.MyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * My Architecture template
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
    ): List<SearchUserModel>? {
        return myRemoteDataSource.getUserBySearchWord(searchWord, page)?.items?.map {
            it.toSearchUserModel()
        }
    }

    override suspend fun insertUser(user: UserModel) {
        myLocalDataSource.insertUser(user.toUser())
    }

    override suspend fun deleteUser(userId: Int) {
        myLocalDataSource.deleteById(userId)
    }
}