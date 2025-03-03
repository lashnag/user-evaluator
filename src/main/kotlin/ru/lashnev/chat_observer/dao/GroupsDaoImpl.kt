package ru.lashnev.chat_observer.dao

import org.springframework.stereotype.Service

@Service
class GroupsDaoImpl: GroupsDao {
    override suspend fun getGroups(): List<GroupsDao.Group> {
        TODO("Not yet implemented")
    }

    override suspend fun setLastMessageId(group: String, lastMessageId: Long) {
        TODO("Not yet implemented")
    }
}