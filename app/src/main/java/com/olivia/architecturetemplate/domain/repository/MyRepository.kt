package com.olivia.architecturetemplate.domain.repository

import com.olivia.architecturetemplate.domain.model.SearchUserModel
import com.olivia.architecturetemplate.domain.model.UserModel
import kotlinx.coroutines.flow.Flow

/**
 * My Architecture template
 * repository
 * @author leesoyoung
 * @since 2021/12/28
 */

interface MyRepository {
    fun observeList(searchWord: String?): Flow<List<UserModel>>
    suspend fun requestList(searchWord: String, page: Int): List<SearchUserModel>?
    suspend fun insertUser(user: UserModel)
    suspend fun deleteUser(userId: Int)
}