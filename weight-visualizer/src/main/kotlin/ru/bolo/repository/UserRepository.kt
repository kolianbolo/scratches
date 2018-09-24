package ru.bolo.repository

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.User

interface UserRepository : CrudRepository<User, Long>