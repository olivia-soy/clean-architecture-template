package com.olivia.architecturetemplate.domain.model

/**
 * My Architecture template
 * SearchUserModel
 * @author leesoyoung
 * @since 2022/04/28
 */
data class SearchUserModel(
    val avatarUrl: String,
    val eventsUrl: String,
    val followersUrl: String,
    val followingUrl: String,
    val gistsUrl: String,
    val gravatarId: String,
    val htmlUrl: String,
    val id: Int,
    val login: String,
    val nodeId: String,
    val organizationsUrl: String,
    val receivedEventsUrl: String,
    val reposUrl: String,
    val score: Double,
    val siteAdmin: Boolean,
    val starredUrl: String,
    val subscriptionsUrl: String,
    val type: String,
    val url: String
)
