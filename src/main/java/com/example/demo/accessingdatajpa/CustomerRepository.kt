package com.example.demo.accessingdatajpa

import org.springframework.data.repository.CrudRepository
import java.util.*

interface CustomerRepository : CrudRepository<Customer?, Long?> {
    fun findByLastName(lastName: String?): List<Customer?>?
    fun findById(id: Long): Optional<Customer?>
}