package edu.pingpong.furnace.otherstuff;

import edu.pingpong.furnace.hardware.GasHeater;
import edu.pingpong.furnace.interfaces.Heater;
import edu.pingpong.furnace.types.RoomTemperature;

public class Jedi implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(this.toucheLightSable());
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        Heater heater = new GasHeater();
        this.forcePersuasion(heater, temperature);
    }

    private double toucheLightSable() {
        final double lightSableTemperature = 1400;
        return lightSableTemperature;
    }

    private void forcePersuasion(Heater heater, RoomTemperature temperature) {
        temperature.incrementTemperature(-1400);
        heater.disengage(temperature);
    }

    public void speak() {
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try ");
    }
}
