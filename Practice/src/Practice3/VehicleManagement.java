package Practice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class VehicleManagement {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public VehicleManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void add(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public Vehicle findByVehicleNumber(String vehicleNumber) {
        if (vehicleList != null) {
            for(Vehicle vehicle: vehicleList) {
                if (vehicle.getVehicleNumber().equals(vehicleNumber)) return vehicle;
            }
        }
        return null;
    }

    public List<Vehicle> findVehicleByIdNumber(String idNumber) {
        List<Vehicle> vehicleList1 = new ArrayList<>();
        for(Vehicle vehicle: vehicleList) {
            if (vehicle.getOwner().getIdNumber().equals(idNumber)) vehicleList1.add(vehicle);
        }
        if(vehicleList1 == null) return null;
        else return vehicleList1;
    }

    public void deleteVehicleByManufacturer(String manufacturer) {
        vehicleList.removeIf(vehicle -> vehicle.getManufacturer().equals(manufacturer));
    }

    public List<String>  findManufacturerWithMostVehicle() {
        List<String> manufacturerList = new ArrayList<>();
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        int max=0;
        for (Vehicle vehicle: vehicleList) {
            if (frequencyMap.containsKey(vehicle.getManufacturer())) {
                frequencyMap.put(vehicle.getManufacturer(), frequencyMap.get(vehicle.getManufacturer()) + 1);
            } else {
                frequencyMap.put(vehicle.getManufacturer(), 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() > max) {
                max=entry.getValue();
            }
        }

        for (HashMap.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == max) {
                manufacturerList.add(entry.getKey());
            }
        }
        return manufacturerList;
    }

    public Vehicle addVehicle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input vehicle number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.println("Input manufacturer: ");
        String manufacturer = scanner.nextLine();

        System.out.println("Input year Of Manufacture: ");
        int yearOfManufacture = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Input vehicle Color: ");
        String vehicleColor = scanner1.nextLine();

        System.out.println("Input year Of Manufacture: ");

        System.out.println("input idNumber: ");
        String idNumber = scanner1.nextLine();
        System.out.println("input fullName: ");
        String fullName = scanner1.nextLine();
        System.out.println("input email: ");
        String email = scanner1.nextLine();

        VehicleOwner vehicleOwner = new VehicleOwner(idNumber, fullName, email);
        Vehicle vehicle = new Vehicle(vehicleNumber, manufacturer, yearOfManufacture, vehicleColor, vehicleOwner);
        return vehicle;
    }

    public Car addCar() {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = addVehicle();

        System.out.println("Input engineType: ");
        String engineType = scanner.nextLine();

        System.out.println("Input numberOfSeats: ");
        int numberOfSeats = scanner.nextInt();

        Car car = new Car(vehicle, numberOfSeats, engineType);
        return car;
    }

    public Motorcycle addMotorcycle() {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = addVehicle();

        System.out.println("Input capacity: ");
        int capacity = scanner.nextInt();

        Motorcycle motorcycle = new Motorcycle(vehicle, capacity);
        return motorcycle;
    }

    public Truck addTruck() {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = addVehicle();

        System.out.println("Input tonnage: ");
        double tonnage = scanner.nextDouble();

        Truck truck = new Truck(vehicle, tonnage);
        return truck;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
