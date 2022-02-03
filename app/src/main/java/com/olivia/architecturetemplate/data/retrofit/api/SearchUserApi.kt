package com.olivia.architecturetemplate.data.retrofit.api

import com.olivia.architecturetemplate.data.retrofit.response.SearchUserResponseData
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * My Architecture template
 * search User
 * @author leesoyoung
 * @since 2021/12/29
 */

interface SearchUserApi {
    @GET("/search/users")
    suspend fun searchUser(
        @Query("q") searchWord: String,
        @Query("page") page: Int
    ): SearchUserResponseData
}
