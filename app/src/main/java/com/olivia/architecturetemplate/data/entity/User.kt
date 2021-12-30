package com.olivia.architecturetemplate.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * architecture template
 * user
 * @author leesoyoung
 * @since 2021/12/29
 */
@Entity(tableName = "user")
data class User(
    @PrimaryKey
    val id: Int,
    val name: String,
    val thumbnail: String
)