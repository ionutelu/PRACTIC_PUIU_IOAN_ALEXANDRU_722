package org.example.Model;

public class Penalty implements HasId<Integer> {
    private Integer id;
    private Integer driverid;
    private PenaltyReason penaltyReason;
    private Integer seconds;
    private Integer lap;

    @Override public void setId(Integer id) { this.id = id; }
    @Override public Integer getId() { return id; }

    public Penalty() {}

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public PenaltyReason getPenaltyReason() {
        return penaltyReason;
    }

    public void setPenaltyReason(PenaltyReason penaltyReason) {
        this.penaltyReason = penaltyReason;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }
}
