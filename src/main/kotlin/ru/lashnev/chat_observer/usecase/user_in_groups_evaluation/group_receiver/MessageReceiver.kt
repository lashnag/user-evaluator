package ru.lashnev.chat_observer.usecase.user_in_groups_evaluation.group_receiver

interface MessageReceiver {
    suspend fun getMessages(group: String, lastMessageId: Long): Map<Long, Message>

    data class Message(val message: String, val user: String)
}