package edu.pingpong.furnace.types;

public class RoomTemperature {

    // instance for the Singleton
    public static RoomTemperature instance;
    private double temperature = 0d;

    private RoomTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Singleton getInstance
    public static RoomTemperature getInstance(double temperature){
        if (instance == null){
            instance = new RoomTemperature(temperature);
        }
        return instance;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }
}
