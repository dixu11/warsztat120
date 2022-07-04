package garage;

public class Garage {

    public Receipt repairCar(Car car) {
        Wheel[] wheels = car.getWheels();
        int count = 0;
        for (Wheel wheel : wheels) {
            if (wheel.isFlat()) {
                wheel.repair(2.2);
                count++;
            }
        }
        return new Receipt("Wymiana opony",50, count);
    }

}
