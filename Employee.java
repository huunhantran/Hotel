package model;

public class Employee {
    private String id;
    private String name;
    private String position;
    private double salary;
    private String phone;

    public Employee(String id, String name, String position, double salary, String phone) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getPhone() { return phone; }
}