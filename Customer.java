package model;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private String cccd;

    public Customer(String id, String name, String phone, String cccd) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cccd = cccd;
    }

    // Getters và Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getCccd() { return cccd; }
}