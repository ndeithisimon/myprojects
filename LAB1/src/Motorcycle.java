public class Motorcycle extends Vehicle {

    private boolean hasSidecar;
    private String engineType; // e.g. "V-Twin", "Inline-4"

    public Motorcycle(String make, String model, int year, String color,
                      double fuelLevel, boolean hasSidecar, String engineType) {
        super(make, model, year, color, fuelLevel);
        this.hasSidecar = hasSidecar;
        this.engineType = engineType;
    }
    
    @Override
    public void accelerate() {
        System.out.println("Motorcycle revs the " + engineType
                + " engine and accelerates swiftly!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle applies front and rear brakes to stop.");
    }

    @Override
    public void gas() {
        fuelLevel += 10;
        System.out.println("Motorcycle refuelled. Fuel level: " + fuelLevel + "L");
    }
    
    public void wheelie() {
        System.out.println("Motorcycle performs a wheelie!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Engine: " + engineType + " | Sidecar: " + hasSidecar);
    }
}