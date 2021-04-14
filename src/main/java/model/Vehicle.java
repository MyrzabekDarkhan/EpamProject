package model;

public abstract class Vehicle {
    public final model.Model model;
    public double fuelConsumption;
    public double velocity;
    public double price;

    protected Vehicle(model.Model model, double fuelConsumption, double velocity, double price) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getVelocity() {
        return velocity;
    }

    public model.Model getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
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
