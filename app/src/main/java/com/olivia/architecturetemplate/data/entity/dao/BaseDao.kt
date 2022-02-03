package com.olivia.architecturetemplate.data.entity.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

/**
 * My Architecture template
 * BaseDao
 * @author leesoyoung
 * @since 2021/12/29
 */
interface BaseDao<T> {

    @Insert
    suspend fun insert(obj: T): Long

    @Insert
    suspend fun insert(vararg obj: T)

    @Insert
    suspend fun insertAll(obj: List<T>)

    @Update
    suspend fun update(obj: T)

    @Update
    suspend fun updateAll(obj: List<T>)

    @Delete
    suspend fun delete(obj: T)

    @Delete
    suspend fun deleteAll(obj: List<T>)
}