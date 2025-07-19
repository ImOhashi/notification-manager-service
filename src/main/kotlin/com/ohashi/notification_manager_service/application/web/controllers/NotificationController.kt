package com.ohashi.notification_manager_service.application.web.controllers

import com.ohashi.notification_manager_service.application.dtos.requests.CreateNotificationRequest
import com.ohashi.notification_manager_service.domain.services.NotificationService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class NotificationController(
    private val notificationService: NotificationService
) {

    @PostMapping
    fun createNotification(@RequestBody createNotificationRequest: CreateNotificationRequest) {
        notificationService.createNotification(createNotificationRequest)
    }
}