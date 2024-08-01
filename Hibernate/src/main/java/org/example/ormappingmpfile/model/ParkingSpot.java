package org.example.ormappingmpfile.model;

import jakarta.persistence.*;
import org.example.ormappingmpfile.model.*;

public class ParkingSpot {
    private int spotNumber;
    private String location;
    private Employee employee;

    public ParkingSpot() {
    }

    public ParkingSpot(String location) {
        this.location = location;
    }

    public ParkingSpot(String location, Employee employee) {
        this.location = location;
        this.employee = employee;
    }

    public ParkingSpot(int spotNumber, String location, Employee employee) {
        this.spotNumber = spotNumber;
        this.location = location;
        this.employee = employee;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
