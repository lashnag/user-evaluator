package ru.lashnev.chat_observer.service.evaluator

interface MessageEvaluator {
    suspend fun process(message: String): EvaluationResult
    fun evaluationType(): EvaluationType

    data class EvaluationResult(
        val result: Double
    ) {
        companion object {
            fun fromString(string: String): EvaluationResult {
                val value = string.toDouble()
                require(value in 0.0..1.0) { "Value must be between 0.0 and 1.0" }
                return EvaluationResult(value)
            }
        }
    }

    enum class EvaluationType {
        TOXICITY, INVOLVEMENT, MESSAGE_COUNT
    }
}