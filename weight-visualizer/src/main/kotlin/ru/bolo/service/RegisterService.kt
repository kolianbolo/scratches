package ru.bolo.service

import org.springframework.stereotype.Service
import ru.bolo.service.intf.IRegisterService

@Service
class RegisterService : IRegisterService {

    override fun register(login: String, password: String): Boolean {
        TODO()
    }
}