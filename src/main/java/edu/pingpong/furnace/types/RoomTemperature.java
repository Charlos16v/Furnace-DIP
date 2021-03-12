package edu.pingpong.furnace.types;

public class RoomTemperature {

    private double temperature = 0d;

    public RoomTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }
}
