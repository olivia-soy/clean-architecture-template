package com.olivia.architecturetemplate.data.entity.dao

import androidx.room.Dao
import androidx.room.Query
import com.olivia.architecturetemplate.data.entity.User
import kotlinx.coroutines.flow.Flow

/**
 * My Architecture template
 * user dao
 * @author leesoyoung
 * @since 2021/12/29
 */
@Dao
interface MyDao : BaseDao<User> {
    @Query("select * from user where name LIKE '%' || :searchWord || '%'")
    fun getUserBySearchWordAsFlow(searchWord: String?): Flow<List<User>>

    @Query("select * from user")
    fun getUserAsFlow(): Flow<List<User>>

    @Query("delete from user where id = :userId")
    suspend fun deleteById(userId: Int)
}