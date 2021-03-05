package com.example.kotlin.rest

import com.example.kotlin.model.Person
import com.example.kotlin.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController(private val personService: PersonService) {

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): ResponseEntity<Person> {
        val person: Person = personService.getPersonById(id)
        return ResponseEntity.ok(person)
    }
}
