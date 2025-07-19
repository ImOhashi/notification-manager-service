package com.ohashi.notification_manager_service.resources.kafka.annotations.strategies

interface SendStrategy<T> {
    fun send(message: T)
}