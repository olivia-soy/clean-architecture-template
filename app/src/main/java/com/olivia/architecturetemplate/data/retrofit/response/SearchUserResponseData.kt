package com.olivia.architecturetemplate.data.retrofit.response

data class SearchUserResponseData(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)