package edu.pingpong.furnace.hardware;

import edu.pingpong.furnace.interfaces.Heater;
import edu.pingpong.furnace.types.RoomTemperature;

public class GasHeater implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);
    }
}
