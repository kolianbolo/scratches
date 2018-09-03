package ru.bolo

import org.springframework.web.bind.annotation.GetMapping

abstract class ParentController(private val weather: String) {

    @GetMapping("/saying")
    fun saying(): String {
        return "Nice weather today($weather), aren't ?"
    }
}