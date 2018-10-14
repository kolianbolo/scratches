package ru.bolo.entity

import java.time.Instant
import javax.persistence.*

@Entity
data class Record(

        @field:Id
        @field:Column
        @field:GeneratedValue
        var id: Long? = null,

        @field:Column
        var weight: Int? = null, //вес, в граммах

        @field:Column
        var date: Instant? = null,

        @field:ManyToOne(fetch = FetchType.EAGER)
        var user: User? = null
)