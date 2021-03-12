package edu.pingpong.furnace.otherstuff;

import edu.pingpong.furnace.interfaces.Heater;
import edu.pingpong.furnace.types.RoomTemperature;

public class Torch implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(10);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);
    }

    public void saySomething() {
        System.out.println("\n"
                + "\t           /|" + "\n"
                + "\t        /\\/ |/\\" + "\n"
                + "\t        \\  ^   | /\\  /\\ " + "\n"
                + "\t  (\\/\\  / ^   /\\/  )/^ )" + "\n"
                + "\t   \\  \\/^ /\\       ^  /" + "\n"
                + "\t    )^       ^ \\     (" + "\n"
                + "\t   (   ^   ^      ^\\  )" + "\n"
                + "\t    \\___\\/____/______/" + "\n"
                + "\t    [________________]" + "\n"
                + "\t     |              |" + "\n"
                + "\t     |     //\\\\     |" + "\n"
                + "\t     |    <<()>>    |" + "\n"
                + "\t     |     \\\\//     |" + "\n"
                + "\t      \\____________/" + "\n"
                + "\t          |    |" + "\n"
                + "\t          |    |" + "\n"
                + "\t          |    |" + "\n"
                + "\t          |    |" + "\n"
                + "\t          |    |" + "\n"
                + "\t          |    |" + "\n" + "\n"
                + "\t The Torch says... fire!");
    }
}
