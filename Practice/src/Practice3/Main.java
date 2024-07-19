package Practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        VehicleManagement vehicleManagement = new VehicleManagement(vehicleList);
        Input input = new Input();
        input.inputScanner(vehicleManagement);
    }
}
