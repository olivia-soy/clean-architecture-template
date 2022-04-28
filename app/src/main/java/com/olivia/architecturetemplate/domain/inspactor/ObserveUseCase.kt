package com.olivia.architecturetemplate.domain.inspactor

import com.olivia.architecturetemplate.domain.base.FlowUseCase
import com.olivia.architecturetemplate.domain.base.Result
import com.olivia.architecturetemplate.domain.di.IoDispatcher
import com.olivia.architecturetemplate.domain.model.UserModel
import com.olivia.architecturetemplate.domain.repository.MyRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * My Architecture template
 * ObserveFavoriteUserUseCase
 * @author leesoyoung
 * @since 2021/12/28
 */

class ObserveUseCase @Inject constructor(
    private val repository: MyRepository,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : FlowUseCase<String?, List<UserModel>?>(dispatcher) {
    override fun execute(params: String?): Flow<Result<List<UserModel>>> {
        return repository.observeList(params).distinctUntilChanged().map {
            Result.Success(it)
        }
    }

}
