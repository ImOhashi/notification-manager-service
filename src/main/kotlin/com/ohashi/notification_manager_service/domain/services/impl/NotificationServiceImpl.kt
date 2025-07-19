package com.ohashi.notification_manager_service.domain.services.impl

import com.ohashi.notification_manager_service.application.dtos.requests.CreateNotificationRequest
import com.ohashi.notification_manager_service.domain.entities.Notification
import com.ohashi.notification_manager_service.domain.services.NotificationService
import com.ohashi.notification_manager_service.resources.kafka.annotations.SendToKafka
import org.springframework.stereotype.Service

@Service
class NotificationServiceImpl : NotificationService {

    @SendToKafka
    override fun createNotification(createNotificationRequest: CreateNotificationRequest): Notification {
        val notification: Notification = Notification(createNotificationRequest)
        return notification
    }
}