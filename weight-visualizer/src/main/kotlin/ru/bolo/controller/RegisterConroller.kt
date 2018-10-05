package ru.bolo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.model.RegisterModel
import ru.bolo.service.intf.IRegisterService
import java.nio.charset.StandardCharsets
import java.security.MessageDigest


@RestController
@RequestMapping("/register")
class RegisterConroller {

    @Autowired
    lateinit var registerService: IRegisterService

    var digest = MessageDigest.getInstance("SHA-256")

    @PostMapping
    fun register(model: RegisterModel) {
        val login: String = model.login ?: throw NullPointerException("login is null")
        val password: String = model.password ?: throw NullPointerException("password is null")
        val hash = digest.digest(password.toByteArray(StandardCharsets.UTF_8))
        registerService.register(login, hash.contentToString())
    }

}