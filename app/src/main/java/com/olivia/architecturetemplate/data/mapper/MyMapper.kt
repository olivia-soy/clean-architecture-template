package com.olivia.architecturetemplate.data.mapper

import com.olivia.architecturetemplate.data.entity.User
import com.olivia.architecturetemplate.data.retrofit.response.Item
import com.olivia.architecturetemplate.domain.model.UserModel

/**
 * # Architecture Template
 * # mapper
 * @author LEESOYOUNG
 * @since 2021-12-30
 */
fun User.toUserModel() = UserModel(
    userId = id,
    name = name,
    imagePath = thumbnail,
    favorite = true
)

fun UserModel.toUser() = User(
    id = userId,
    name = name,
    thumbnail = imagePath
)
fun Item.toUserModel(favorite: Boolean) = UserModel(
    userId = id,
    name = login,
    imagePath = avatar_url,
    favorite = favorite
)
