package model;

import model.interfaces.Televsion;

public class BusinessCar extends Vehicle implements Televsion {
    private boolean isTVOn;
    private int currentChannel;

    public BusinessCar(model.Model model, double fuelConsumption, double velocity, double price) {
        super(model, fuelConsumption, velocity, price);
    }

    @Override
    public void turnOnTV() {
        isTVOn = true;
    }

    @Override
    public void turnOffTV() {
        isTVOn = false;
    }

    @Override
    public void switchChannel(int changedChannels) {
        currentChannel = currentChannel + changedChannels;
    }

    @Override
    public String toString() {
        return "{" +
                "fuel consumption = '" + fuelConsumption + '\'' +
                ", model = " + model +
                ", velocity = " + velocity +
                ", price = " + price +
                ", tv = " + isTVOn +
                '}';
    }
}
