package ru.bolo.repositories

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.Session

interface SessionRepository : CrudRepository<Session, String>