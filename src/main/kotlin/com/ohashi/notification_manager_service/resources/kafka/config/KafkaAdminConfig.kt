package com.ohashi.notification_manager_service.resources.kafka.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.springframework.boot.autoconfigure.kafka.KafkaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin

@Configuration
class KafkaAdminConfig(
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
