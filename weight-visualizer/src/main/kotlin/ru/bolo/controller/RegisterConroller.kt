package ru.bolo.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.model.RegisterModel

@RestController
@RequestMapping("/register")
class RegisterConroller{

    @PostMapping
    fun register(model : RegisterModel){

    }

}