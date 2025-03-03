package ru.lashnev.chat_observer.service.evaluator

interface MessageEvaluator {
    suspend fun process(message: String): EvaluationResult
    fun evaluationType(): EvaluationType

    data class EvaluationResult(
        val result: Double
    )

    enum class EvaluationType {
        TOXICITY, INVOLVEMENT, MESSAGE_COUNT
    }
}