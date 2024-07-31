package org.example.ormappingannotation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "parkingspot")
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spotnumber")
    private int spotNumber;

    @Column(name = "location", length = 45)
    private String location;

    @OneToOne()
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    public ParkingSpot() {
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
