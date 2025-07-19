package com.ohashi.notification_manager_service.resources.kafka.annotations.strategies.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.ohashi.notification_manager_service.domain.entities.Notification
import com.ohashi.notification_manager_service.resources.kafka.annotations.strategies.SendStrategy
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component("EMAIL")
class EmailStrategyImpl(
    @Value("\${app.kafka.topics.email-topic.name}") private val emailTopicName: String,
    private val kafkaTemplate: KafkaTemplate<String, String>,
    private val objectMapper: ObjectMapper
) : SendStrategy<Notification> {

    override fun send(message: Notification) {
        objectMapper.writeValueAsString(message).let { stringMessage ->
            kafkaTemplate.send(emailTopicName, stringMessage)
        }
    }
}