package com.ohashi.notification_manager_service.domain.entities

import com.ohashi.notification_manager_service.application.dtos.requests.CreateNotificationRequest
import com.ohashi.notification_manager_service.domain.entities.enums.NotificationMethod
import java.util.UUID

data class Notification(
    val id: UUID,
    val destination: String,
    val title: String,
    val message: String,
    val notificationMethod: NotificationMethod
) {
    constructor(createNotificationRequest: CreateNotificationRequest) : this(
        id = UUID.randomUUID(),
        destination = createNotificationRequest.destination,
        title = createNotificationRequest.title,
        message = createNotificationRequest.message,
        notificationMethod = createNotificationRequest.notificationMethod
    )
}