package ru.bolo.repository

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.Session
import ru.bolo.entity.User

interface SessionRepository : CrudRepository<Session, String> {
    fun findAllByCustomer(user: User) : Iterable<Session>
}