package com.ohashi.notification_manager_service.resources.kafka.annotations

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class SendToKafka()
