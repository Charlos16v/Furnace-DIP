package edu.pingpong.furnace;

import edu.pingpong.furnace.hardware.GasHeater;
import edu.pingpong.furnace.hardware.Regulator;
import edu.pingpong.furnace.hardware.RemoteCommandSensor;
import edu.pingpong.furnace.interfaces.Heater;
import edu.pingpong.furnace.interfaces.Thermometer;
import edu.pingpong.furnace.otherstuff.Jedi;
import edu.pingpong.furnace.otherstuff.Torch;
import edu.pingpong.furnace.types.RoomTemperature;


public class App {
    public static void main(String[] args) {
        final double minTemp = 10.0;
        final double maxTemp = 23.0;

        // RoomTemperature temperature = new RoomTemperature(15);
        RoomTemperature temperature = RoomTemperature.getInstance(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println("Starting GasHeater...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);


        Torch torch = new Torch();
        System.out.println("\nStarting Torch... ");
        regulator.regulate(thermometer, torch, minTemp, maxTemp, temperature);
        torch.saySomething();


        Jedi yoda = new Jedi();
        System.out.println( "\nStarting Yoda... " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
