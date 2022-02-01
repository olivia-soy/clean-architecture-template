package com.olivia.architecturetemplate.domain.inspactor

import com.olivia.architecturetemplate.domain.base.ResultUseCase
import com.olivia.architecturetemplate.domain.repository.MyRepository
import com.olivia.architecturetemplate.presentation.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

/**
 * My DeliveryHero
 * ResultUseCase
 * @author leesoyoung
 * @since 2021/12/28
 */
class MyResultUseCase @Inject constructor(
    private val repository: MyRepository,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : ResultUseCase<Int, Unit?>(dispatcher) {
    override suspend fun execute(params: Int) {
        repository.deleteUser(params)
    }
}