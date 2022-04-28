package com.olivia.architecturetemplate.data.mapper

import com.olivia.architecturetemplate.data.retrofit.response.Item
import com.olivia.architecturetemplate.domain.model.SearchUserModel
import com.olivia.architecturetemplate.data.entity.User
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

fun Item.toSearchUserModel() = SearchUserModel(
    avatarUrl = avatar_url,
    eventsUrl = events_url,
    followersUrl = followers_url,
    followingUrl = following_url,
    gistsUrl = gists_url,
    gravatarId = gravatar_id,
    htmlUrl = html_url,
    id = id,
    login = login,
    nodeId = node_id,
    organizationsUrl = organizations_url,
    receivedEventsUrl = received_events_url,
    reposUrl = repos_url,
    score = score,
    siteAdmin = site_admin,
    starredUrl = starred_url,
    subscriptionsUrl = subscriptions_url,
    type = type,
    url = url
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
