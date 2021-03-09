package com.example.person.service

import com.example.person.model.Person

interface PersonService {
    fun getPersonById(id: Int): Person
    fun getAll(): List<Person>
}
