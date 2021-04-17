package com.example.demo.scheduledTasks

import org.springframework.stereotype.Component
import org.springframework.scheduling.annotation.Scheduled
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.text.SimpleDateFormat
import java.util.*

@Component
class ScheduledTasks {
    private val log: Logger = LoggerFactory.getLogger(ScheduledTasks::class.java)

    private val dateFormat = SimpleDateFormat("HH:mm:ss")

    @Scheduled(fixedRate = 5000)
    fun reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(Date()))
    }
}