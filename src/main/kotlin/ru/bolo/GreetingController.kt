package ru.bolo

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Validated
@RestController
class GreetingController : ParentController("rain") {

    @GetMapping("/greeting")
    fun greeting(): String {
        return "Hello, my master"
    }
}