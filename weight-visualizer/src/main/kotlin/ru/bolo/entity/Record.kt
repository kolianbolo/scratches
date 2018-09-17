package ru.bolo.entity

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Record(

        @field:Id
        @field:Column
        @field:GeneratedValue
        var id: Long? = null,

        @field:Column
        var weight: Int? = null, //вес, в граммах

        @field:Column
        var date: Instant? = null
)