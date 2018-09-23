package ru.bolo.entity

import java.time.Instant
import javax.persistence.*

@Entity
data class Session(

        @field:Id
        @field:Column
        var id: String? = null,

        @field:OneToOne(fetch = FetchType.EAGER)
        var customer: User? = null,

        var expire: Instant? = null
)