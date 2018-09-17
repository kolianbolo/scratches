package ru.bolo.entity

import java.time.Instant
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToOne

data class Session(

        @field:Id
        @field:Column
        var id: String?,

        @field:OneToOne(fetch = FetchType.EAGER)
        var customer: Customer?,
        var expire: Instant?
)