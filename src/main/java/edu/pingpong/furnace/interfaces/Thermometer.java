package edu.pingpong.furnace.interfaces;

import edu.pingpong.furnace.types.RoomTemperature;

public interface Thermometer {

    double read(RoomTemperature temperature);
}
