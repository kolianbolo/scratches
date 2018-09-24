package ru.bolo.repository

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.Session

interface SessionRepository : CrudRepository<Session, String>