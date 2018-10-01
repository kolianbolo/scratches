package ru.bolo.service.intf

interface IRegisterService {
    public fun register(login: String, password: String): Boolean
}