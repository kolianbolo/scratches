package ru.bolo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.bolo.entity.Record
import ru.bolo.repository.RecordRepository
import java.time.Instant

@RestController
@RequestMapping("/weight")
class WeightController {

    @Autowired
    lateinit var recordRepository: RecordRepository

    @PostMapping
    fun saveMeasure(weight: Int) {
        recordRepository.save(Record(weight = weight, date = Instant.now()))
    }

    @GetMapping
    fun getMeasures(): List<Record> {
        return recordRepository.findAll().toList()
    }
}