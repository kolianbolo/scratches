package ru.bolo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.bolo.entity.Record
import java.time.Instant

@RestController
@RequestMapping("/weight")
class WeightController{

    @Autowired
    lateinit var recordRepository: RecordRepository

    @PostMapping
    fun saveMeasure(weight : Integer){
        recordRepository.save(Record().apply {
            this.weight = weight;
            this.date = Instant.now() }
        )
    }

    @GetMapping
    fun getWeight(){

    }


}