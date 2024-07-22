package Practice.Practice3;

public class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private int yearOfManufacture;
    private String vehicleColor;
    private VehicleOwner owner;

    public Vehicle(String vehicleNumber, String manufacturer, int yearOfManufacture, String vehicleColor, VehicleOwner owner) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleColor = vehicleColor;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public VehicleOwner getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwner owner) {
        this.owner = owner;
    }

    public Vehicle findVehicleByVehicleNumber(String vehicleNumber) {
        if(this.vehicleNumber.equals(getVehicleNumber())) {
            return this;
        } else return null;
    }
}
