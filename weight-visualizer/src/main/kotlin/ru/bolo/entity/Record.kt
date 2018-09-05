package ru.bolo.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Record() {

    @Id
    val id: Long? = null
    val weight: Double? = null
    //val date: Date? = null
}