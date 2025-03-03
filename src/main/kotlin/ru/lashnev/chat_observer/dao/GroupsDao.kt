package ru.lashnev.chat_observer.dao

import ru.lashnev.chat_observer.usecase.user_in_groups_evaluation.group_receiver.MessageReceiver

interface GroupsDao {
    suspend fun getGroups(): List<Group>
    suspend fun setLastMessageId(group: String, lastMessageId: Long)

    data class Group(
        val name: String,
        val lastMessageId: Long,
        val messageReceiver: MessageReceiver,
    )
}