package ru.bolo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/weight")
class WeightController{

    @PostMapping
    fun saveMeasure(weight : Float){

    }

    @GetMapping
    fun getWeight(){

    }


}