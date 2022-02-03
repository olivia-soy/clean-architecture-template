package com.olivia.architecturetemplate.domain.model

/**
 * My Architecture template
 * user model
 * @author leesoyoung
 * @since 2021/12/28
 */

data class UserModel(
    val userId: Int,
    val name: String,
    val imagePath: String,
    var favorite: Boolean
)
