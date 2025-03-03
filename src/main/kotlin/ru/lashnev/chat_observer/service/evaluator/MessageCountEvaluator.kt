package ru.lashnev.chat_observer.service.evaluator

import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationResult
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType.MESSAGE_COUNT

@Service
class MessageCountEvaluator : MessageEvaluator {
    override suspend fun process(message: String): EvaluationResult {
        return EvaluationResult(1.0)
    }

    override fun evaluationType(): EvaluationType {
        return MESSAGE_COUNT
    }
}