package ru.bolo.entity

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Record {

    @Id
    var id: Long? = null

    @Column
    var weight: Integer? = null //вес, в граммах

    @Column
    var date: Instant? = null
}