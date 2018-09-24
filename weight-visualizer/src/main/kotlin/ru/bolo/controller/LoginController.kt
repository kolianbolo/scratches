package ru.bolo.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/login")
class LoginController {

    @PostMapping
    fun login(login: String, password: String): String {
        return ""
    }
}