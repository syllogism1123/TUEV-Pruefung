package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
    private List<Car> carList;
    private CarInspectionService service;

    @BeforeEach
    void setup() {
        Car testCar1 = new Car(4, 5, true, true);
        Car testCar2 = new Car(4, 3, true, true);
        Car testCar3 = new Car(4, 3, false, true);
        Car testCar4 = new Car(4, 3, true, false);
        Car testCar5 = new Car(4, 6, true, true);
        Car testCar6 = new Car(5, 3, true, true);
        carList = (List.of(testCar1, testCar2, testCar3, testCar4, testCar5, testCar6));
        service = new CarInspectionService();
    }

    @Test
    void testCheckNumberOfTires() { //car 4
        assertEquals(4, carList.get(3).getNumberOfTires());
    }

    @Test
    void testCheckAirbag() { //car 2
        assertTrue(carList.get(1).isAirbag());
    }

    @Test
    void testCheckSeatBelt() {  //car 5
        assertTrue(carList.get(4).isSeatBelt());
    }

    @Test
    void testCheckNumberOfDoors() { // car 1 ,car 2
        assertEquals(5, carList.get(0).getNumberOfDoors());
        assertEquals(3, carList.get(1).getNumberOfDoors());
    }

    @Test //car 1
    void testCheckCar() { //car 1
        assertTrue(service.checkCar(carList.get(0)));
    }
}