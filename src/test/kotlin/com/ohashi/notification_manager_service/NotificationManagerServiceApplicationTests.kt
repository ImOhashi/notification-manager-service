package com.ohashi.notification_manager_service

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class NotificationManagerServiceApplicationTests {

	@Test
	fun contextLoads() {
	}

}
