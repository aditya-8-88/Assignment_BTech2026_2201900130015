class Ticket {
    private String seatNumber;
    private boolean isBooked;

    public Ticket(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean book() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }
}
