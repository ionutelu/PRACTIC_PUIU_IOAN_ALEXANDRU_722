package org.example.service;

import org.example.Model.Event;
import org.example.Repository.IRepository;

import java.util.List;

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


}
