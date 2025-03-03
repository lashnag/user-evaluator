package ru.lashnev.chat_observer.service.evaluator

import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationResult
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType.INVOLVEMENT

@Service
class InvolvementMessageEvaluator : MessageEvaluator {
    override suspend fun process(message: String): EvaluationResult {
        TODO("Not yet implemented")
    }

    override fun evaluationType(): MessageEvaluator.EvaluationType {
        return INVOLVEMENT
    }
}