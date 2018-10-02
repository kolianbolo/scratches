package ru.bolo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.bolo.entity.User
import ru.bolo.repository.UserRepository
import ru.bolo.service.intf.IRegisterService

@Service
class RegisterService : IRegisterService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun register(login: String, password: String): Boolean {
        userRepository.save(User(login = login, password = password))
    }
}