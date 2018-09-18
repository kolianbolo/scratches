package ru.bolo.entity

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @PostMapping
    fun login(login: String, password: String): Session {

    }
}