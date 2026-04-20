public interface Automobile {

    int MAX_PASSENGERS = 8;
    double MAX_CARGO_KG = 500.0;
    
    void honk();
    void openTrunk();
    void activateAC();
    void enableGPS();
    
    default void park() {
        System.out.println("Automobile is parking...");
    }
}