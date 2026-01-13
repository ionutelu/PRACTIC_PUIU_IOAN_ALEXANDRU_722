package org.example.Model;

public class Driver implements HasId<Integer>{
    private Integer id;
    private String name;
    private String team;
    private DriverStatus status;
    private Integer skillLevel;

    public Driver() {}

    @Override public Integer getId() { return id; }
    @Override public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public Integer getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(Integer skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + team + " | " + status + " | " + skillLevel;
    }






}
