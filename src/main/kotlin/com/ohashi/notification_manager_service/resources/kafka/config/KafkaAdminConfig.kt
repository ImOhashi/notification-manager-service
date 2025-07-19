package com.ohashi.notification_manager_service.resources.kafka.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder
import org.springframework.kafka.core.KafkaAdmin
import org.springframework.kafka.core.KafkaAdmin.NewTopics

@Configuration
class KafkaAdminConfig(
    @Value("\${app.kafka.topics.email-topic.name}") private val emailTopicName: String,
    @Value("\${app.kafka.topics.email-topic.partitions}") private val emailTopicPartitions: Int,
    private val properties: KafkaProperties
) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val configs: Map<String, Any> = mapOf(
            AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG to properties.bootstrapServers
        )

        return KafkaAdmin(configs)
    }
}