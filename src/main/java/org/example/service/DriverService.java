package org.example.service;

import org.example.Model.Driver;
import org.example.Model.DriverStatus;
import org.example.Repository.IRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Driver> task3(){
        List<Driver> drivers = new ArrayList<>();
        drivers = driverRepository.findAll().stream()
                .sorted(Comparator.comparing(Driver::getSkillLevel).reversed()
                        .thenComparing(Driver::getName))
                .toList();

        return drivers;
    }

    public List<Driver> task4(){
        List<Driver> drivers = new ArrayList<>();
        drivers = driverRepository.findAll().stream()
                .sorted(Comparator.comparing(Driver::getSkillLevel).reversed()
                        .thenComparing(Driver::getName))
                .toList();

        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\that1\\IdeaProjects\\PRACTIC_PUIU_IOAN_ALEXANDRU_722\\drivers_sorted.json"))) {
            for (Driver d : drivers) pw.println(d);
        } catch (IOException e) { e.printStackTrace(); }

        return drivers;
    }


}
