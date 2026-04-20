public class Bus extends Vehicle {

    protected int passengerCapacity;
    protected int currentPassengers;
    protected boolean isPublicTransport;

    public Bus(String make, String model, int year, String color,
               double fuelLevel, int passengerCapacity, boolean isPublicTransport) {
        super(make, model, year, color, fuelLevel);
        this.passengerCapacity = passengerCapacity;
        this.currentPassengers = 0;
        this.isPublicTransport = isPublicTransport;
    }
    
    @Override
    public void accelerate() {
        System.out.println("Bus gradually accelerates, carrying "
                + currentPassengers + " passengers.");
    }

    @Override
    public void stop() {
        System.out.println("Bus slows down and stops at the bus stop.");
    }

    @Override
    public void gas() {
        fuelLevel += 60;
        System.out.println("Bus refuelled with diesel. Fuel level: " + fuelLevel + "L");
    }
    
    public void boardPassenger() {
        if (currentPassengers < passengerCapacity) {
            currentPassengers++;
            System.out.println("Passenger boarded. Passengers: "
                    + currentPassengers + "/" + passengerCapacity);
        } else {
            System.out.println("Bus is full. Cannot board more passengers.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Capacity: " + passengerCapacity
                + " | Public Transport: " + isPublicTransport);
    }
}