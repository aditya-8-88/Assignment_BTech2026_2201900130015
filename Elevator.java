public class Elevator {
    private int currentFloor;
    private int totalFloors;
    private boolean doorOpen;

    public Elevator(int totalFloors) {
        this.currentFloor = 0; // assuming ground floor as the starting point
        this.totalFloors = totalFloors;
        this.doorOpen = false;
    }

    public void openDoor() {
        if (!doorOpen) {
            doorOpen = true;
            System.out.println("Door is now open.");
        } else {
            System.out.println("Door is already open.");
        }
    }

    public void closeDoor() {
        if (doorOpen) {
            doorOpen = false;
            System.out.println("Door is now closed.");
        } else {
            System.out.println("Door is already closed.");
        }
    }

    public void moveToFloor(int floor) {
        if (floor < 0 || floor >= totalFloors) {
            System.out.println("Invalid floor number.");
            return;
        }
        if (doorOpen) {
            System.out.println("Please close the door before moving.");
            return;
        }
        System.out.println("Moving from floor " + currentFloor + " to floor " + floor);
        currentFloor = floor;
        System.out.println("Arrived at floor " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator(10);
        elevator.openDoor();
        elevator.closeDoor();
        elevator.moveToFloor(5);
        elevator.openDoor();
        elevator.closeDoor();
        elevator.moveToFloor(3);
    }
}