package com.ohashi.notification_manager_service.resources.kafka.annotations.aspects

import com.ohashi.notification_manager_service.domain.entities.Notification
import com.ohashi.notification_manager_service.resources.kafka.annotations.SendToKafka
import com.ohashi.notification_manager_service.resources.kafka.annotations.strategies.SendStrategy
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class KafkaSendAspect(
    private val sendStrategies: Map<String, SendStrategy<Notification>>
) {

    @Around("@annotation(sendToKafka)")
    fun sendReturnToKafka(joinPoint: ProceedingJoinPoint, sendToKafka: SendToKafka) {
        joinPoint.proceed().let { notification ->
            val notificationMessage = notification as Notification

            val sendStrategy = sendStrategies[notificationMessage.notificationMethod.name]!!

            sendStrategy.send(notificationMessage)
        }
    }
}