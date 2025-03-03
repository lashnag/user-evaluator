package ru.lashnev.chat_observer.service.evaluator

import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationResult
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType.INVOLVEMENT
import ru.lashnev.chat_observer.service.llm.LlmClient

@Service
class InvolvementMessageEvaluator(private val llmClient: LlmClient) : MessageEvaluator {
    override suspend fun process(message: String): EvaluationResult =
        EvaluationResult.fromString(
            llmClient("На сколько это сообщение говорит о вовлеченности от 0.0 до 1.0")
        )

    override fun evaluationType(): MessageEvaluator.EvaluationType {
        return INVOLVEMENT
    }
}