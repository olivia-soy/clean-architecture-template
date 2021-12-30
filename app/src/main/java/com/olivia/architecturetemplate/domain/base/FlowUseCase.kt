package com.olivia.architecturetemplate.domain.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart

/**
 * My DeliveryHero
 * FlowUseCase
 * @author leesoyoung
 * @since 2021/12/28
 */
abstract class FlowUseCase<P, R>(private val dispatcher: CoroutineDispatcher) {
    suspend operator fun invoke(params: P) = execute(params)
        .catch { e ->
            emit(Result.Error(Exception(e)))
        }.onStart {
            emit(Result.Start)
        }.flowOn(dispatcher)

    protected abstract suspend fun execute(params: P): Flow<Result<R>>
}