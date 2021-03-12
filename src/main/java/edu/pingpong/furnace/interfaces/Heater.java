package edu.pingpong.furnace.interfaces;

import edu.pingpong.furnace.types.RoomTemperature;

public interface Heater {

    public void engage(RoomTemperature temperature);
    public void disengage(RoomTemperature temperature);
}
