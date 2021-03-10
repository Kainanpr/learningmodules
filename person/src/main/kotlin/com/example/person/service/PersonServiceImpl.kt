package com.example.person.service

import com.example.person.model.Person
import com.example.person.service.exception.PersonNotFoundException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl : PersonService {
    private val LOGGER = LoggerFactory.getLogger(this::class.java)

    private val database = arrayListOf(
        Person(1, "Carlos", "223.123.123-22"),
        Person(2, "Tevez", "122.123.432-23"),
        Person(3, "Henrique", "111.222.321-22"),
        Person(4, "Gabriel", "433.443.223-12"),
        Person(5, "Tiago", "433.542.123-90")
    )

    override fun getPersonById(id: Int): Person {
        val foundPerson = database.find { item -> item.id == id }
        LOGGER.info("Found person: $foundPerson")
        return foundPerson ?: throw PersonNotFoundException()
    }

    override fun getAll(): List<Person> {
        LOGGER.info("Get all: $database")
        return database;
    }
}
