package model;

import model.interfaces.Minibar;

public class LimousineCar extends Vehicle implements Minibar {
    private double minibarCapacity = 10.5;

    public LimousineCar(model.Model model, double fuelConsumption, double velocity, double price) {
        super(model, fuelConsumption, velocity, price);
    }

    @Override
    public void consumeDrinks() {
        if (!drinkIsEmpty()) {
            minibarCapacity--;
        }
    }

    @Override
    public void fillDrink() {
        minibarCapacity = 10.5;
    }

    @Override
    public boolean drinkIsEmpty() {
        return minibarCapacity == 0;
    }

    @Override
    public String toString() {
        return "{" +
                "fuel consumption = '" + fuelConsumption + '\'' +
                ", model = " + model +
                ", velocity = " + velocity +
                ", price = " + price +
                ", tv = " + minibarCapacity +
                '}';
    }

}