package ru.bolo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.bolo.entity.Session
import ru.bolo.entity.User
import ru.bolo.repository.SessionRepository
import ru.bolo.repository.UserRepository
import ru.bolo.service.intf.ISessionService
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.util.*

@Service
class SessionService : ISessionService {

    @Autowired
    private lateinit var sessionRepository: SessionRepository

    @Autowired
    private lateinit var userRepository: UserRepository

    private var digest = MessageDigest.getInstance("SHA-256")

    override fun createSession(user: User): Session {
        return user.id?.let {
            //TODO: customer не
            val expiredSessions = sessionRepository.findAllByCustomer(user)
            if (expiredSessions.count() > 0) {
                sessionRepository.deleteAll(expiredSessions)
            }
            sessionRepository.save(Session(id = UUID.randomUUID().toString(), customer = user))
        } ?: throw IllegalStateException("User.id must not be null")
    }


    override fun check(login: String, passwordForCheck: String): User? {
        val user = userRepository.findByLogin(login)
        if (user.password != Base64.getEncoder().encodeToString(digest.digest(passwordForCheck.toByteArray(StandardCharsets.UTF_8)))) {
            return null
        }
        return user
    }

    override fun register(login: String, password: String) {
        userRepository.save(User(login = login, password = passwordToHash(password)))
    }

    private fun passwordToHash(password: String): String {
        return Base64.getEncoder().encodeToString(digest.digest(password.toByteArray(StandardCharsets.UTF_8)))
    }

}