package model;

public class Service {
    private String id;
    private String serviceName;
    private double price;
    private String status;

    public Service(String id, String serviceName, double price, String status) {
        this.id = id;
        this.serviceName = serviceName;
        this.price = price;
        this.status = status;
    }

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}