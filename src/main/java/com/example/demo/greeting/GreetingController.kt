package com.example.demo.greeting

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam

import org.springframework.web.bind.annotation.GetMapping

import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    private val template = "Hello, %s!"
    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Greeting? {
        return Greeting(counter.incrementAndGet(), String.format(template, name))
    }
}