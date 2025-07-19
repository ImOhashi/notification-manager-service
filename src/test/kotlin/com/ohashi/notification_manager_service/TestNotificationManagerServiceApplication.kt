package com.ohashi.notification_manager_service

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<NotificationManagerServiceApplication>().with(TestcontainersConfiguration::class).run(*args)
}
