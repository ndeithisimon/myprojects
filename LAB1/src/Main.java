
public class Main {

    public static void main(String[] args)
    {
        Sedan sedan = new Sedan
                (
                "Toyota", "Camry", 2023, "Pearl White",
                40.0, 4, true, false, 480.0
                );

        sedan.displayInfo();
        System.out.println();
        Vehicle vehicleRef = sedan;
        vehicleRef.accelerate();
        System.out.println();

        System.out.println("1. accelerate() — no args (overridden base version):");
        sedan.accelerate();

        System.out.println("2. accelerate(int targetSpeedKph):");
        sedan.accelerate(120);

        System.out.println("3. accelerate(int targetSpeedKph, int gear):");
        sedan.accelerate(100, 4);

        System.out.println("4. accelerate(boolean turboBoost):");
        sedan.accelerate(true);
        System.out.println();

        System.out.println("--- OTHER SEDAN ACTIONS ---");
        sedan.stop();
        sedan.gas();
        sedan.honk();
        sedan.activateAC();
        sedan.openTrunk();
        sedan.enableGPS();
        sedan.park();
        System.out.println();

        System.out.println("--- POLYMORPHISM SHOWCASE ---");
        Vehicle[] fleet =
                {
                new Motorcycle("Yamaha", "MT-07", 2022, "Black",
                        15.0, false, "Inline-4"),
                new Bus("Tata", "StarBus", 2021, "Blue",
                        80.0, 50, true),
                new SportsCar("Porsche", "911 Turbo", 2024, "Red",
                        55.0, 640, true, 2.8)
                };

        for (Vehicle v : fleet)
        {
            System.out.print(v.make + " " + v.model + ": ");
            v.accelerate(); // each subclass runs its own overridden version
        }
    }
}