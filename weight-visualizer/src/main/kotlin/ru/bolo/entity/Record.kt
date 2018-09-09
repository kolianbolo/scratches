package ru.bolo.entity

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Record() {

    @Id
    val id: Long? = null

    @Column
    val weight: Integer? = null //вес, в граммах 

    @Column
    val date: Instant? = null
}