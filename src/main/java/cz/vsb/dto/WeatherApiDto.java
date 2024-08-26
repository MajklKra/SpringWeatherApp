package cz.vsb.dto;

public class WeatherApiDto {
    private Location location;
    private Current current;

    private Condition condition;

    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
    }

    public Condition getCondition() {return condition;}
}



