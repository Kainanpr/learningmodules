package com.example.kotlin.service

import com.example.kotlin.model.Person

interface PersonService {
    fun getPersonById(id: Int): Person
}