package model;

public class EconomCar extends Vehicle {
    public EconomCar(model.Model model, double fuelConsumption, double velocity, double price) {
        super(model, fuelConsumption, velocity, price);
    }

    @Override
    public String toString() {
        return "{" +
                "fuel consumption = '" + fuelConsumption + '\'' +
                ", model = " + model +
                ", velocity = " + velocity +
                ", price = " + price +
                '}';
    }
}
