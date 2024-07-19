package Practice3;

public class Motorcycle extends Vehicle{
    private int capacity;

    public Motorcycle(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, int capacity) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.capacity = capacity;
    }

    public Motorcycle(Vehicle vehicle, int capacity) {
        super(vehicle.getVehicleNumber(), vehicle.getManufacturer(), vehicle.getYearOfManufacture(), vehicle.getVehicleColor(), vehicle.getOwner());
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
                + ", capacity" + capacity;
    }
}
