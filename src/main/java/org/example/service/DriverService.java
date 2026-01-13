package org.example.service;

import org.example.Model.Driver;
import org.example.Model.DriverStatus;
import org.example.Repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private final IRepository<Driver, Integer> driverRepository;

    public DriverService(IRepository<Driver, Integer> driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getAll() { return driverRepository.findAll(); }

    public List<Driver> task2(String givenTeam){
        List<Driver> drivers = new ArrayList<>();
        for (Driver driver : driverRepository.findAll()) {
            if (driver.getTeam().equals(givenTeam) && driver.getStatus().equals(DriverStatus.ACTIVE)) {
                drivers.add(driver);
            }
        }
        return drivers;
    }
}
