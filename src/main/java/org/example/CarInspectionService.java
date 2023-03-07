package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarInspectionService {

    private List<Car> carList;

    public CarInspectionService() {
        this.carList = new ArrayList<>();

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean checkNumberOfTires(Car car) {
        return car.getNumberOfTires() == 4;
    }


    public boolean checkAirbag(Car car) {
        return car.isAirbag();
    }

    public boolean checkSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    public boolean checkNumberOfDoors(Car car) {
        return car.getNumberOfDoors() == 3 ||
                car.getNumberOfDoors() == 5;
    }

    public boolean checkCar(Car car) {
        return checkNumberOfTires(car) &&
                checkAirbag(car) &&
                checkNumberOfDoors(car) &&
                checkSeatBelt(car);
    }


}
