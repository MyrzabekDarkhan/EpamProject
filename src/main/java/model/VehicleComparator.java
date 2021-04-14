package model;

import java.util.Comparator;

class VehicleComparator implements Comparator<Vehicle> {

    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
            return 1;
        } else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
            return -1;
        } else {
            return 0;
        }
    }
}