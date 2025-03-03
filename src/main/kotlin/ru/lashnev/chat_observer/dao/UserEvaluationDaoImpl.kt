package ru.lashnev.chat_observer.dao

import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator

@Service
class UserEvaluationDaoImpl : UserEvaluationDao {
    override suspend fun saveEvaluation(user: String, evaluationResult: MessageEvaluator.EvaluationResult) {
        TODO("Not yet implemented")
    }
}