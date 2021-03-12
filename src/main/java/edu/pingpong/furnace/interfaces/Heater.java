package edu.pingpong.furnace.interfaces;

import edu.pingpong.furnace.types.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
}
