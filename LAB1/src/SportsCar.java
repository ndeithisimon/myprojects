public class SportsCar extends Vehicle implements Automobile {

    private int horsepower;
    private boolean hasTurbo;
    private double zeroToHundredSecs; // 0–100 km/h time

    public SportsCar(String make, String model, int year, String color,
                     double fuelLevel, int horsepower, boolean hasTurbo,
                     double zeroToHundredSecs) {
        super(make, model, year, color, fuelLevel);
        this.horsepower = horsepower;
        this.hasTurbo = hasTurbo;
        this.zeroToHundredSecs = zeroToHundredSecs;
    }

    @Override
    public void accelerate() {
        System.out.println("SportsCar ROARS and hits 100 km/h in "
                + zeroToHundredSecs + " seconds!");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar deploys carbon-ceramic brakes for an instant stop.");
    }

    @Override
    public void gas() {
        fuelLevel += 50;
        System.out.println("SportsCar refuelled with premium fuel. Level: " + fuelLevel + "L");
    }

    @Override
    public void honk() {
        System.out.println("SportsCar: *aggressive horn blast*");
    }

    @Override
    public void openTrunk() {
        System.out.println("SportsCar frunk (front trunk) opened.");
    }

    @Override
    public void activateAC() {
        System.out.println("SportsCar cabin AC activated with dual-zone climate control.");
    }

    @Override
    public void enableGPS() {
        System.out.println("SportsCar GPS + track mode navigation enabled.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  HP: " + horsepower + " | Turbo: " + hasTurbo
                + " | 0-100: " + zeroToHundredSecs + "s");
    }
}