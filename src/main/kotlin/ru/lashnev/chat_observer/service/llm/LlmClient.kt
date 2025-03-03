package ru.lashnev.chat_observer.service.llm

interface LlmClient {
    suspend operator fun invoke(request: String): String
}