package ru.bolo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.entity.Session

@RestController
class LoginController {

    @PostMapping
    fun login(login: String, password: String): Session {
        return Session();
    }
}