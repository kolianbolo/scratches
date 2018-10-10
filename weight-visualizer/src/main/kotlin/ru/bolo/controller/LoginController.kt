package ru.bolo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.entity.User
import ru.bolo.model.ErrorModel
import ru.bolo.model.ResultModel
import ru.bolo.service.intf.ISessionService

@RestController
@RequestMapping("/login")
class LoginController {

    @Autowired
    private lateinit var sessionService: ISessionService

    @PostMapping
    fun login(login: String, password: String): ResultModel<String> {
        return check(login, password)?.let {
            val session = sessionService.createSession(it)
            ResultModel(value = session.id)
        } ?: ResultModel(error = ErrorModel(0, "Incorrect login or password"))


        return null
    }

    private fun check(login: String, password: String): User? {
        // TODO: берем хеш
        // ищем в БД
        // нашли - красава
        // не нашли - всё плохо
    }

}