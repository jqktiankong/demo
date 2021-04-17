package com.example.demo.accessingdatajpa

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null
) {
    constructor(firstName: String, lastName: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }
}