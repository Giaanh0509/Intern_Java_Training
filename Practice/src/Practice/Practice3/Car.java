package Practice.Practice3;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String engineType;

    public Car(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner, int numberOfSeats, String engineType) {
        super(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, owner);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public Car(Vehicle vehicle, int numberOfSeats, String engineType) {
        super(vehicle.getVehicleNumber(), vehicle.getManufacturer(), vehicle.getYearOfManufacture(), vehicle.getVehicleColor(), vehicle.getOwner());
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
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
                + ", numberOfSeats: " + numberOfSeats
                + ", engineType: " + engineType;
    }
}
