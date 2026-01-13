package org.example.service;

import org.example.Model.Penalty;
import org.example.Repository.IRepository;

import java.util.List;

public class PenaltyService {
    private final IRepository<Penalty,Integer> penaltyRepository;
    public PenaltyService(IRepository<Penalty,Integer> penaltyRepository) {
        this.penaltyRepository = penaltyRepository;
    }

    public List<Penalty> getAll() {
        return penaltyRepository.findAll();
    }
}
