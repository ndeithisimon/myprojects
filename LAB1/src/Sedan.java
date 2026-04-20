public class Sedan extends Vehicle implements Automobile {

    private int numberOfDoors;
    private boolean hasAC;
    private boolean hasSunroof;
    private double trunkCapacityLitres;

    public Sedan(String make, String model, int year, String color,
                 double fuelLevel, int numberOfDoors, boolean hasAC,
                 boolean hasSunroof, double trunkCapacityLitres) {
        super(make, model, year, color, fuelLevel);
        this.numberOfDoors = numberOfDoors;
        this.hasAC = hasAC;
        this.hasSunroof = hasSunroof;
        this.trunkCapacityLitres = trunkCapacityLitres;
    }
    
    @Override
    public void accelerate() {
        System.out.println("Sedan accelerates smoothly using the default engine mode.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan applies disc brakes and comes to a safe stop.");
    }

    @Override
    public void gas() {
        fuelLevel += 45;
        System.out.println("Sedan refuelled. Fuel level: " + fuelLevel + "L");
    }
    
    public void accelerate(int targetSpeedKph) {
        System.out.println("Sedan accelerating to " + targetSpeedKph + " km/h...");
    }
    
    public void accelerate(int targetSpeedKph, int gear) {
        System.out.println("Sedan accelerating to " + targetSpeedKph
                + " km/h in gear " + gear + ".");
    }
    
    public void accelerate(boolean turboBoost) {
        if (turboBoost) {
            System.out.println("Sedan engages TURBO BOOST and surges forward!");
        } else {
            System.out.println("Sedan accelerates normally without turbo.");
        }
    }
    
    @Override
    public void honk() {
        System.out.println("Sedan: Beep beep!");
    }

    @Override
    public void openTrunk() {
        System.out.println("Sedan trunk opened. Capacity: " + trunkCapacityLitres + "L");
    }

    @Override
    public void activateAC() {
        if (hasAC) {
            System.out.println("Sedan AC activated. Cooling the cabin...");
        } else {
            System.out.println("This Sedan does not have AC.");
        }
    }

    @Override
    public void enableGPS() {
        System.out.println("Sedan GPS enabled. Navigation ready.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Doors: " + numberOfDoors + " | AC: " + hasAC
                + " | Sunroof: " + hasSunroof
                + " | Trunk: " + trunkCapacityLitres + "L");
    }
}