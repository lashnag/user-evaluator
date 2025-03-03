package ru.lashnev.chat_observer.dao

import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator.EvaluationResult

interface UserEvaluationDao {
    suspend fun saveEvaluation(user: String, evaluationResult: EvaluationResult)
}