package practice.practice3;

import java.util.Scanner;

public class Input {
    public Input() {
    }

    public void inputScanner(VehicleManagement vehicleManagement) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Add vehicle ");
            System.out.println("2. Search for transport by vehicle number ");
            System.out.println("3. Find the vehicle owner's vehicle with the corresponding cmnd number ");
            System.out.println("4. Delete all vehicles of any manufacturer ");
            System.out.println("5. Indicate which manufacturer has the most vehicles under management ");
            System.out.println("6. Sort vehicles by number of vehicles in descending order ");
            System.out.println("7. Statistics of each vehicle type, how many vehicles are being managed ");
            System.out.println("8. Exit ");
            int option = scanner.nextInt();

            switch (option) {

                case 1: {
                    System.out.println("Select the type of vehicle you want to add ");
                    System.out.println("1. Car ");
                    System.out.println("2. Motorcycle");
                    System.out.println("3. Truck ");
                    System.out.println("4. Return to Menu");
                    Scanner scanner1 = new Scanner(System.in);
                    int optionVihicle = scanner1.nextInt();
                    switch (optionVihicle) {
                        case 1: {
                            vehicleManagement.add(vehicleManagement.addCar());
                            continue;
                        }
                        case 2: {
                            vehicleManagement.add(vehicleManagement.addMotorcycle());
                            continue;
                        }
                        case 3: {
                            vehicleManagement.add(vehicleManagement.addTruck());
                            continue;
                        }
                        case 4:break;
                    }
                    continue;
                }

                case 2: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input the numberVehicle you want to find ");
                    String vehicleNumber = scanner1.nextLine();
                    if(vehicleManagement.findByVehicleNumber(vehicleNumber) == null) {
                        System.out.println("No suitable vehicles were found");
                    }
                    else {
                        if (vehicleManagement.findByVehicleNumber(vehicleNumber) instanceof Car) {
                            System.out.println(((Car) vehicleManagement.findByVehicleNumber(vehicleNumber)).toString());
                        }
                        else if (vehicleManagement.findByVehicleNumber(vehicleNumber) instanceof Motorcycle) {
                            System.out.println(((Motorcycle) vehicleManagement.findByVehicleNumber(vehicleNumber)).toString());

                        }
                        else if (vehicleManagement.findByVehicleNumber(vehicleNumber) instanceof Truck) {
                            System.out.println(((Truck) vehicleManagement.findByVehicleNumber(vehicleNumber)).toString());
                        }
                    }
                    continue;
                }

                case 3: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input the id number you want to find ");
                    String idNumber = scanner1.nextLine();
                    if(vehicleManagement.findVehicleByIdNumber(idNumber) == null) {
                        System.out.println("No suitable vehicles were found");
                    }
                    else {
                        for (Vehicle vehicle: vehicleManagement.findVehicleByIdNumber(idNumber)) {
                            if (vehicle instanceof Car) {
                                System.out.println(((Car) vehicle).toString());
                            }
                            else if (vehicle instanceof Motorcycle) {
                                System.out.println(((Motorcycle) vehicle).toString());

                            }
                            else if (vehicle instanceof Truck) {
                                System.out.println(((Truck) vehicle).toString());
                            }
                        }
                    };
                    continue;
                }

                case 4: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input the manufacturer you want to delete ");
                    String manufacturer = scanner1.nextLine();
                    vehicleManagement.deleteVehicleByManufacturer(manufacturer);
                    continue;
                }

                case 5: {
                    System.out.println("Manufacturers own the most facilities is: \n ");
                    for (String manufacturer: vehicleManagement.findManufacturerWithMostVehicle()) {
                        System.out.println(manufacturer);
                    }
                    continue;
                }

                case 7: {
                    int countCar=0, countMotorcycle=0, countTruck=0;

                    for (Vehicle vehicle: vehicleManagement.getVehicleList()) {
                        if (vehicle instanceof Car) countCar++;
                        else if (vehicle instanceof Motorcycle) countMotorcycle++;
                        else if (vehicle instanceof Truck) countTruck++;
                    }

                    System.out.println("Number of vehicles being managed: " + vehicleManagement.getVehicleList().size());
                    System.out.println("Number of Car being managed: " + countCar);
                    System.out.println("Number of Motorcycle being managed: " + countMotorcycle);
                    System.out.println("Number of Truck being managed: " + countTruck);
                    continue;
                }

                case 8: System.exit(0);
            }
        }
    }
}
