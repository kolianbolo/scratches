package ru.bolo.repository

import org.springframework.data.repository.CrudRepository
import ru.bolo.entity.Record

interface RecordRepository : CrudRepository<Record, Long>