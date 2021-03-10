package com.example.person.service.exception

class PersonNotFoundException(message: String? = "Person not found") : RuntimeException(message)
