package org.example;


import org.example.Model.Driver;
import org.example.Model.Event;
import org.example.Model.Penalty;
import org.example.Repository.DriverRepository;
import org.example.Repository.EventRepository;
import org.example.Repository.IRepository;
import org.example.Repository.PenaltyRepository;
import org.example.controller.ConsoleController;
import org.example.service.DriverService;
import org.example.service.EventService;
import org.example.service.PenaltyService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IRepository<Driver, Integer> driverRepository = new DriverRepository("C:\\Users\\that1\\IdeaProjects\\PRACTIC_PUIU_IOAN_ALEXANDRU_722\\drivers.json");
        IRepository<Event,Integer> eventRepository = new EventRepository("C:\\Users\\that1\\IdeaProjects\\PRACTIC_PUIU_IOAN_ALEXANDRU_722\\events.json");
        IRepository<Penalty, Integer> penaltyRepository = new PenaltyRepository("C:\\Users\\that1\\IdeaProjects\\PRACTIC_PUIU_IOAN_ALEXANDRU_722\\penalties.json");


        DriverService driverService = new DriverService(driverRepository);
        EventService eventService = new EventService(eventRepository);
        PenaltyService penaltyService = new PenaltyService(penaltyRepository);

        ConsoleController controller = new ConsoleController (penaltyService,driverService,eventService);
        controller.run();
    }
}
