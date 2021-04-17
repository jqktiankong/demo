package com.example.demo.consumingrest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Quote(
    val type: String,
    val value: Value
)