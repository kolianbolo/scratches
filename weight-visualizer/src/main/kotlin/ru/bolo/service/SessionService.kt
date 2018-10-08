package ru.bolo.service

import org.springframework.beans.factory.annotation.Autowired
import ru.bolo.entity.Session
import ru.bolo.entity.User
import ru.bolo.repository.SessionRepository
import ru.bolo.service.intf.ISessionService

class SessionService : ISessionService {

    @Autowired
    private lateinit var sessionRepository: SessionRepository

    override fun createSession(user: User): Session {
        //TODO: только тут userId
        sessionRepository.findById(user.id)
    }

}