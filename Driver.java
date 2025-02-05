class Driver {
    private String name;
    private boolean available = true;

    public Driver(String name) { this.name = name; }

    public boolean isAvailable() { return available; }

    public void acceptRide() { available = false; }

    public void completeRide() { available = true; }
}

class Ride {
    private String source, destination;
    private Driver driver;

    public Ride(String source, String destination, Driver driver) {
        this.source = source;
        this.destination = destination;
        this.driver = driver;
    }

    public void startRide() {
        System.out.println("Ride started from " + source + " to " + destination);
        driver.acceptRide();
    }

    public void endRide() {
        System.out.println("Ride completed!");
        driver.completeRide();
    }
}
