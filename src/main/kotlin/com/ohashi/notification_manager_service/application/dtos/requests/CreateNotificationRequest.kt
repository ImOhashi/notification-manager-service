package com.ohashi.notification_manager_service.application.dtos.requests

import com.ohashi.notification_manager_service.domain.entities.enums.NotificationMethod

data class CreateNotificationRequest(
    val destination: String,
    val title: String,
    val message: String,
    val notificationMethod: NotificationMethod
)
