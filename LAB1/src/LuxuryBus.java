class LuxuryBus extends Bus {

    private boolean hasWifi;
    private boolean hasRecliningSeats;

    public LuxuryBus(String make, String model, int year, String color,
                     double fuelLevel, int passengerCapacity,
                     boolean hasWifi, boolean hasRecliningSeats) {
        super(make, model, year, color, fuelLevel, passengerCapacity, false);
        this.hasWifi = hasWifi;
        this.hasRecliningSeats = hasRecliningSeats;
    }

    @Override
    public void accelerate() {
        System.out.println("Luxury Bus glides smoothly at highway speed — "
                + "passengers barely feel the motion.");
    }

    public void serveRefreshments() {
        System.out.println("LuxuryBus: Refreshments are being served to passengers.");
    }
}

class SchoolBus extends Bus {

    private String schoolName;
    private int minStudentAge;

    public SchoolBus(String make, String model, int year, String color,
                     double fuelLevel, int passengerCapacity,
                     String schoolName, int minStudentAge) {
        super(make, model, year, color, fuelLevel, passengerCapacity, false);
        this.schoolName = schoolName;
        this.minStudentAge = minStudentAge;
    }

    @Override
    public void accelerate() {
        System.out.println("School Bus accelerates carefully — "
                + "student safety is the top priority.");
    }

    public void doRollCall() {
        System.out.println("SchoolBus (" + schoolName + "): Roll call in progress...");
    }
}