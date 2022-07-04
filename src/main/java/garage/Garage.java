package garage;

import javax.swing.*;

public class Garage {

    private final static double PRICE = 50;
    private final static String DEFAULT_REPAIR_TYPE = "Wymiana opony";
    private final static double DEFAULT_PRESSURE = 2.2;



    public Receipt repairCar(Car car) {
        Wheel[] wheels = car.getWheels();
        int count = 0;
        for (Wheel wheel : wheels) {
            if (wheel.isFlat()) {
                wheel.repair(DEFAULT_PRESSURE);
                count++;
            }
        }
        return new Receipt(DEFAULT_REPAIR_TYPE, PRICE, count);
    }

}
