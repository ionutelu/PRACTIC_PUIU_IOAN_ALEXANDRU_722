package org.example.controller;

import org.example.Model.Driver;
import org.example.Model.Event;
import org.example.Model.Penalty;
import org.example.service.DriverService;
import org.example.service.EventService;
import org.example.service.PenaltyService;

import java.util.List;
import java.util.Scanner;

public class ConsoleController {
    private final PenaltyService penaltyService;
    private final DriverService driverService;
    private final EventService eventService;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleController(PenaltyService penaltyService, DriverService driverService, EventService eventService) {
        this.penaltyService = penaltyService;
        this.driverService = driverService;
        this.eventService = eventService;
    }

    public void run()
    {
        System.out.println("Drivers loaded: " + driverService.getAll().size());
        System.out.println("Events loaded: " + penaltyService.getAll().size());
        System.out.println("Penalties loaded: " + eventService.getAll().size());

        penaltyService.getAll();
        driverService.getAll().forEach(System.out::println);
        eventService.getAll();

        driverService.task2("Ferrari").forEach(System.out::println);

        driverService.task3().forEach(System.out::println);


    }


}
