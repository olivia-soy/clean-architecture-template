package com.olivia.architecturetemplate.domain.base

/**
 * My DeliveryHero
 * Result
 * @author leesoyoung
 * @since 2021/12/28
 */
sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
    object Start : Result<Nothing>()
}