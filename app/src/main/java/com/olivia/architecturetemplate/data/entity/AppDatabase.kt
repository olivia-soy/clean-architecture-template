package com.olivia.architecturetemplate.data.entity

import androidx.room.Database
import androidx.room.RoomDatabase
import com.olivia.architecturetemplate.data.entity.AppDatabase.Companion.DATA_BASE_VERSION
import com.olivia.architecturetemplate.data.entity.dao.MyDao

/**
 * My Architecture template
 * AppDatabase
 * @author leesoyoung
 * @since 2021/12/29
 */
@Database(
    entities = [User::class],
    version = DATA_BASE_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun UserDao(): MyDao

    companion object {
        const val DATA_BASE_VERSION = 1
    }
}
