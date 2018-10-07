package ru.bolo.service.intf

import ru.bolo.entity.Session
import ru.bolo.entity.User

interface ISessionService {

    fun createSession(user: User): Session
}