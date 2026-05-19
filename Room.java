package model;

public class Room {
    private String id;
    private String roomNumber;
    private String roomType;
    private double price;
    private String status;

    public Room(String id, String roomNumber, String roomType, double price, String status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.status = status;
    }

    // Getters và Setters
    public String getId() { return id; }
    public String getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }
}