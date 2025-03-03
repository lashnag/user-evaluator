package ru.lashnev.chat_observer.usecase.user_in_groups_evaluation.group_receiver

import org.springframework.stereotype.Service

@Service
class TelegramMessageReceiver : MessageReceiver {
    override suspend fun getMessages(group: String, lastMessageId: Long): Map<Long, MessageReceiver.Message> {
        TODO("Not yet implemented")
    }
}