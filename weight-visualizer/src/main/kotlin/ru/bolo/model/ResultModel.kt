package ru.bolo.model

data class ResultModel<V>(val value: V? = null, val error: ErrorModel? = null)
