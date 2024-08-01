package org.example.ormappingmpfile.model;
import jakarta.persistence.*;

public class Employee {
    private int id;
    private String name;
    private ParkingSpot parkingSpot;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, ParkingSpot parkingSpot) {
        this.id = id;
        this.name = name;
        this.parkingSpot = parkingSpot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
