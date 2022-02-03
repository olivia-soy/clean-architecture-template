package com.olivia.architecturetemplate.data.datasource.local;

import com.olivia.architecturetemplate.data.entity.User
import kotlinx.coroutines.flow.Flow

/**
 * My Architecture template
 * local data source
 * @author leesoyoung
 * @since 2021/12/29
 */

interface MyLocalDataSource {
    fun getUserBySearchWordAsFlow(searchWord: String?): Flow<List<User>>
    suspend fun deleteById(userId: Int)
    suspend fun insertUser(user: User)
}
