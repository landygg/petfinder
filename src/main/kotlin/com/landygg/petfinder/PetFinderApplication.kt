package com.landygg.petfinder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PetFinderApplication

fun main(args: Array<String>) {
    runApplication<PetFinderApplication>(*args)
}