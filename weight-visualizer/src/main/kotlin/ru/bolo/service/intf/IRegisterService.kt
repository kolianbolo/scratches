package ru.bolo.service.intf

interface IRegisterService {
    fun register(login: String, password: String): Boolean
}