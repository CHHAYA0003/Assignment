package com.traini8.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(Instant.now());
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
