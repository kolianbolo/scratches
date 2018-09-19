package ru.bolo.repositories

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.User

interface UserRepository : CrudRepository<User, Long>