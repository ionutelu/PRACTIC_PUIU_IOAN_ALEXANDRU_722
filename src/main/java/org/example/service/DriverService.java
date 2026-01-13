package org.example.service;

import org.example.Model.Driver;
import org.example.Repository.IRepository;

import java.util.List;

public class DriverService {
    private final IRepository<Driver, Integer> driverRepository;

    public DriverService(IRepository<Driver, Integer> driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getAll() { return driverRepository.findAll(); }

}
