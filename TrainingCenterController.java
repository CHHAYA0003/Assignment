package com.traini8.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Validated @RequestBody TrainingCenter trainingCenter) {
        return ResponseEntity.ok(service.saveTrainingCenter(trainingCenter));
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}
