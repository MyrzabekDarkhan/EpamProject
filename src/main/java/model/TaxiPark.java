package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TaxiPark {
    private List<Vehicle> cars;

    public TaxiPark() {
        cars = new ArrayList<>();
    }

    public List<Vehicle> getCars() {
        return cars;
    }

    public void addCar(Vehicle car) {
        cars.add(car);
    }

    public void removeCar(Vehicle car) {
        cars.remove(car);
    }

    public double getTotalPriceOfTaxiPark() {
        double totalprice = 0;

        for (Vehicle car : cars) {
            totalprice += car.getPrice();
        }

        return totalprice;
    }

    public List<Vehicle> getCarListByParams(double minimumVelocity, double maximumVelocity) {
        List<Vehicle> foundCars = new ArrayList<>();

        for (Vehicle car : cars) {
            if (car.getVelocity() >= minimumVelocity && car.getVelocity() <= maximumVelocity) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public List<Vehicle> sortByFuelConsumption() {
        Collections.sort(cars, new VehicleComparator());
        return cars;
    }
}
