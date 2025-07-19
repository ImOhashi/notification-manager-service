package com.ohashi.notification_manager_service.domain.services

import com.ohashi.notification_manager_service.application.dtos.requests.CreateNotificationRequest
import com.ohashi.notification_manager_service.domain.entities.Notification

interface NotificationService {
    fun createNotification(createNotificationRequest: CreateNotificationRequest): Notification
}