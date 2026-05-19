package model;

public class Booking {
    private String bookingId;
    private String customer;
    private String room;
    private String checkIn;
    private String checkOut;
    private String status;

    public Booking(String bookingId, String customer, String room, String checkIn, String checkOut, String status) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = status;
    }

    // Getters và Setters
    public String getBookingId() { return bookingId; }
    public String getCustomer() { return customer; }
    public String getRoom() { return room; }
    public String getCheckIn() { return checkIn; }
    public String getCheckOut() { return checkOut; }
    public String getStatus() { return status; }
}