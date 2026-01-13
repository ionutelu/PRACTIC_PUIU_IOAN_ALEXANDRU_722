package org.example.service;

import org.example.Model.Event;
import org.example.Model.EventType;
import org.example.Repository.IRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EventService {
    private IRepository<Event,Integer> eventRepository;

    public EventService(IRepository<Event,Integer> eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public int calculatePoints(Event e) {
        return switch (e.getEventType()) {
            case OVERTAKE -> e.getPoints() + 1;
            case FASTEST_LAP -> e.getPoints() + 2 * e.getLap();
            case TRACK_LIMITS -> e.getPoints() - 5;
            case COLLISION -> e.getPoints() -10 - e.getLap();
            case PIT_STOP -> e.getPoints();

        };
    }

    public void task5ComputePoints() {
        eventRepository.findAll().stream().limit(5).forEach(e -> {
            System.out.println("Event " + e.getId() + " -> rawPoints=" + e.getPoints() +
                    " -> computedPoints=" + calculatePoints(e));
        });
    }

    public void task7GenerateReport() {
        Map<EventType, Long> counts = eventRepository.findAll().stream()
                .collect(Collectors.groupingBy(Event::getEventType, Collectors.counting()));
        try (PrintWriter pw = new PrintWriter(new FileWriter("race_report.txt"))) {
            for (EventType et : EventType.values()) {
                pw.println(et + " -> " + counts.getOrDefault(et, 0L));
            }
        } catch (IOException e) { e.printStackTrace(); }
    }


}
