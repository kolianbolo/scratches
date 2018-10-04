package ru.bolo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.model.RegisterModel
import ru.bolo.service.intf.IRegisterService

@RestController
@RequestMapping("/register")
class RegisterConroller {

    @Autowired
    lateinit var registerService: IRegisterService

    @PostMapping
    fun register(model: RegisterModel) {
        val login: String = model.login ?: throw NullPointerException("login is null")
        val password: String = model.password ?: throw NullPointerException("password is null")
        registerService.register(login, password)
    }

}