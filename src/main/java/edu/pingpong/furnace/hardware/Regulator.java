package edu.pingpong.furnace.hardware;


import edu.pingpong.furnace.interfaces.Heater;
import edu.pingpong.furnace.interfaces.Thermometer;
import edu.pingpong.furnace.types.RegulatorDisplayCodes;
import edu.pingpong.furnace.types.RoomTemperature;

public class Regulator {

    public void regulate(
            Thermometer thermometer, Heater heater,
                         double minTemp, double maxTemp, RoomTemperature temperature
    ) {
        RegulatorDisplayCodes code;
        while (thermometer.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            heater.engage(temperature);
            showMessage(code, temperature);
        }

        while (thermometer.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            heater.disengage(temperature);
            showMessage(code, temperature);
        }
    }

    private void showMessage(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
            case WAITING:
                System.out.println("WAITING... Temperature => " + temperature.getTemperature());
                break;
            case HEATING:
                System.out.println("HEATING... Temperature => " + temperature.getTemperature());
                break;
            default:
                System.out.println("Something strange it's happening...");
                break;
        }
    }
}
