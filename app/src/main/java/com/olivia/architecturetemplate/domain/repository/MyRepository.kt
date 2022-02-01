package com.olivia.architecturetemplate.domain.repository

import com.olivia.architecturetemplate.data.entity.User
import com.olivia.architecturetemplate.data.retrofit.response.SearchUserResponseData
import com.olivia.architecturetemplate.domain.model.UserModel
import kotlinx.coroutines.flow.Flow

/**
 * My DeliveryHero
 * repository
 * @author leesoyoung
 * @since 2021/12/28
 */

interface MyRepository {
    fun observeList(searchWord: String?): Flow<List<UserModel>>
    suspend fun requestList(searchWord: String, page: Int): SearchUserResponseData?
    suspend fun insertUser(user: User)
    suspend fun deleteUser(userId: Int)
}