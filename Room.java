import java.util.*;

class Room {
    private int roomNumber;
    private boolean isBooked = false;

    public Room(int roomNumber) { this.roomNumber = roomNumber; }

    public boolean bookRoom() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }

    public void checkout() { isBooked = false; }
}

class Hotel {
    private List<Room> rooms = new ArrayList<>();

    public Hotel(int totalRooms) {
        for (int i = 1; i <= totalRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public boolean bookAvailableRoom() {
        for (Room room : rooms) {
            if (room.bookRoom()) return true;
        }
        return false;
    }
}
