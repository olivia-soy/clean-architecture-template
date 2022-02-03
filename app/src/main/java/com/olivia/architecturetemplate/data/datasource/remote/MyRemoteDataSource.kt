package com.olivia.architecturetemplate.data.datasource.remote

import com.olivia.architecturetemplate.data.retrofit.response.SearchUserResponseData

/**
 * My Architecture template
 * UserRemoteDataSource
 * @author leesoyoung
 * @since 2021/12/29
 */

interface MyRemoteDataSource {
    suspend fun getUserBySearchWord(searchWord: String, page: Int): SearchUserResponseData?
}