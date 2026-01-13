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
}
