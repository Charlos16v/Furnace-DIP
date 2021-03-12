package edu.pingpong.furnace.interfaces;

import edu.pingpong.furnace.types.RoomTemperature;

public interface Thermometer {

    public double read(RoomTemperature temperature);
}
