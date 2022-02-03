package com.olivia.architecturetemplate.data.datasource.local

import com.olivia.architecturetemplate.data.entity.User
import com.olivia.architecturetemplate.data.entity.dao.MyDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * My Architecture template
 * LocalDataSource implement
 * @author leesoyoung
 * @since 2021/12/29
 */

class MyLocalDataSourceImpl @Inject constructor(private val myDao: MyDao) :
    MyLocalDataSource {
    override fun getUserBySearchWordAsFlow(searchWord: String?): Flow<List<User>> =
        if (searchWord == null)
            myDao.getUserAsFlow()
        else
            myDao.getUserBySearchWordAsFlow(searchWord)

    override suspend fun insertUser(user: User) {
        myDao.insert(user)
    }

    override suspend fun deleteById(userId: Int) {
        myDao.deleteById(userId)
    }
}