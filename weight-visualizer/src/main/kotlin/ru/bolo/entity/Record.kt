package ru.bolo.entity

import javax.persistence.Entity
import javax.persistence.Id
import java.time.LocalDateTime

@Entity
class Record() {

    @Id
    val id: Long? = null
    val weight: Double? = null
    val date: LocalDateTime? = null
}