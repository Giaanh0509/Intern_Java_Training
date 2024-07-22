package practice.practice3;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, double tonnage) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.tonnage = tonnage;
    }

    public Truck(Vehicle vehicle, double tonnage) {
        super(vehicle.getVehicleNumber(), vehicle.getManufacturer(), vehicle.getYearOfManufacture(), vehicle.getVehicleColor(), vehicle.getOwner());
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + this.getVehicleNumber()
                + ", manufacturer: " + this.getManufacturer()
                + ", yearOfManufacture: " + this.getManufacturer()
                + ", vehicleColor:" + this.getVehicleColor()
                + ", owner [idNumber: " + this.getOwner().getIdNumber()
                + ", fullName: " + this.getOwner().getFullName()
                + ", email: " + this.getOwner().getEmail() + "]"
                + ", tonnage" + tonnage;
    }
}
