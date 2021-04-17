package com.example.demo.consumingrest

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate
import java.lang.Exception

@SpringBootApplication
open class ConsumingRestApplication {
    private val log: Logger = LoggerFactory.getLogger(ConsumingRestApplication::class.java)

    @Bean
    open fun restTemplate(builder: RestTemplateBuilder): RestTemplate? {
        return builder.build()
    }

    @Bean
    @Throws(Exception::class)
    open fun run(restTemplate: RestTemplate): CommandLineRunner? {
        return CommandLineRunner { args: Array<String?>? ->
            val quote = restTemplate.getForObject(
                "https://quoters.apps.pcfone.io/api/random", Quote::class.java
            )
            log.info(quote.toString())
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(ConsumingRestApplication::class.java, *args)
}