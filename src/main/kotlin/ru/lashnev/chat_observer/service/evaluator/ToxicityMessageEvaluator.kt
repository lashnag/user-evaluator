package ru.lashnev.chat_observer.service.evaluator

import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationResult
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationType.TOXICITY

@Service
class ToxicityMessageEvaluator : MessageEvaluator {
    override suspend fun process(message: String): EvaluationResult {
        TODO("Not yet implemented")
    }

    override fun evaluationType(): EvaluationType {
        return TOXICITY
    }
}