package ru.bolo.entity

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id

data class User(
        @field:Id
        @field:Column
        @field:GeneratedValue
        var id: Long?,

        val login: String?,

        //TODO: Fix store naked passwords
        var password: String?
)