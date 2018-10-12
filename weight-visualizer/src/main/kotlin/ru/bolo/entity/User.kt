package ru.bolo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
        @field:Id
        @field:Column
        @field:GeneratedValue
        var id: Long? = null,

        var login: String? = null,

        //TODO: Fix store naked password
        var password: String? = null
)