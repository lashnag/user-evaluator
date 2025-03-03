package ru.lashnev.chat_observer.usecase.user_in_groups_evaluation

import kotlinx.coroutines.runBlocking
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import ru.lashnev.chat_observer.dao.GroupsDao
import ru.lashnev.chat_observer.dao.UserEvaluationDao
import ru.lashnev.chat_observer.service.evaluator.MessageEvaluator

@Service
class UserInGroupEvaluationUseCase(
    private val groupsDao: GroupsDao,
    private val userEvaluationDao: UserEvaluationDao,
    private val messageEvaluators: List<MessageEvaluator>
) {
    @Scheduled
    fun invoke() {
        runBlocking {
            groupsDao.getGroups().forEach { group ->
                val messages = group.messageReceiver.getMessages(group.name, group.lastMessageId)
                messages.forEach { message ->
                    messageEvaluators.forEach { evaluator ->
                        userEvaluationDao.saveEvaluation(
                            message.value.user,
                            evaluator.process(message.value.message)
                        )
                    }
                }
                messages.keys.maxOfOrNull { it }?.let { maxMessageId ->
                    groupsDao.setLastMessageId(group.name, maxMessageId)
                }
            }
        }
    }
}