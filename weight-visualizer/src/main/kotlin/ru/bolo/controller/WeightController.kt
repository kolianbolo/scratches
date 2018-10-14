package ru.bolo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.bolo.entity.Record
import ru.bolo.repository.RecordRepository
import ru.bolo.repository.SessionRepository
import java.time.Instant

@RestController
@RequestMapping("/weight")
class WeightController {

    @Autowired
    lateinit var recordRepository: RecordRepository

    @Autowired
    lateinit var sessionRepository: SessionRepository

    @PostMapping
    fun saveMeasure(weight: Int, @RequestHeader("sessionId") sessionId: String) {
        val session = sessionRepository.findById(sessionId)
        recordRepository.save(Record(weight = weight,
                date = Instant.now(),
                user = session.orElseThrow { RuntimeException("Don't find session by id = $sessionId") }.customer))
    }

    @GetMapping
    fun getMeasures(): List<Record> {
        return recordRepository.findAll().toList()
    }
}