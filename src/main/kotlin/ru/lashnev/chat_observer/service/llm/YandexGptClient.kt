package ru.lashnev.chat_observer.service.llm

import org.springframework.stereotype.Service

@Service
class YandexGptClient : LlmClient {
    override suspend fun invoke(request: String): String {
        TODO("Not yet implemented")
    }
}