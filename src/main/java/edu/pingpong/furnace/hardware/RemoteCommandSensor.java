package edu.pingpong.furnace.hardware;

import edu.pingpong.furnace.interfaces.Thermometer;
import edu.pingpong.furnace.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
