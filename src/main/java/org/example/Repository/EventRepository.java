package org.example.Repository;


import org.example.Model.Event;

public class EventRepository extends FileRepository<Event, Integer>{
    public EventRepository(String filename) {
        super(filename, Event.class);
    }
}
