public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected double fuelLevel;

    public Vehicle(String make, String model, int year, String color, double fuelLevel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }
    
    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
    public void displayInfo() {
        System.out.println("Vehicle: " + year + " " + make + " " + model
                + " | Color: " + color + " | Fuel: " + fuelLevel + "L");
    }
}