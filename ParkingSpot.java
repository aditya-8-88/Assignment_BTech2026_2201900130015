enum VehicleType { BIKE, CAR, TRUCK; }

class Vehicle {
    private String licensePlate;
    private VehicleType type;
    
    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getType() { return type; }
}

class ParkingSpot {
    private boolean occupied;
    private VehicleType type;

    public ParkingSpot(VehicleType type) {
        this.type = type;
        this.occupied = false;
    }

    public boolean isAvailable() { return !occupied; }

    public void park(Vehicle v) {
        if (v.getType() == type && isAvailable()) {
            occupied = true;
        }
    }

    public void leave() { occupied = false; }
}
