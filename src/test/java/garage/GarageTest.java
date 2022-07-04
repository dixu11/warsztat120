package garage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    @Test
    public void repairCarFixesAllWheels() {
        //given
        Wheel wheel1 = new Wheel(2.2);
        Wheel wheel2 = new Wheel(2.2);
        Wheel wheel3 = new Wheel(2.4);
        Wheel[] wheels = {wheel1, wheel2, wheel3};

        //2 wheels are flat
        wheel1.doFlatTire();
        wheel2.doFlatTire();
        //wheel3 is OK
        Car car = new Car(wheels);
        Garage garage = new Garage();

        //when
        Receipt receipt = garage.repairCar(car);

        //than
        assertEquals(2, receipt.getCount());
        assertFalse(wheel1.isFlat());
        assertFalse(wheel2.isFlat());
    }

}