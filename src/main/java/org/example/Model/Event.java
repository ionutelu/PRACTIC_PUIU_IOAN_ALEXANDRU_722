package org.example.Model;

public class Event implements HasId<Integer>{
    private Integer id;
    private Integer driverId;
    private EventType eventType;
    private Integer points;
    private Integer lap;

    public Event() {}

    @Override public Integer getId() { return id; }
    @Override public void setId(Integer id) { this.id = id; }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }
}
