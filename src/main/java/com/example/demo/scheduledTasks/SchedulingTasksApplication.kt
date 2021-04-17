package com.example.demo.scheduledTasks

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class SchedulingTasksApplication {

}

fun main(args: Array<String>) {
    SpringApplication.run(SchedulingTasksApplication::class.java)
}