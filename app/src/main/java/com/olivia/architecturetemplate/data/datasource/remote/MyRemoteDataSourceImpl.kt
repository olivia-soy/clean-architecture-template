package com.olivia.architecturetemplate.data.datasource.remote

import com.olivia.architecturetemplate.data.retrofit.api.SearchUserApi
import com.olivia.architecturetemplate.data.retrofit.response.SearchUserResponseData
import javax.inject.Inject

/**
 * My Architecture template
 * UserRemoteDataSource Implement
 * @author leesoyoung
 * @since 2021/12/29
 */

class MyRemoteDataSourceImpl @Inject constructor(
    private val userApi: SearchUserApi
) : MyRemoteDataSource {
    override suspend fun getUserBySearchWord(searchWord: String, page: Int): SearchUserResponseData =
        userApi.searchUser(searchWord, page)
}