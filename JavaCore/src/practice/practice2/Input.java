package practice.practice2;

import java.text.ParseException;
import java.util.Scanner;

public class Input {
    public Input() {
    }

    public void inputScanner(DSHHManagement dshhManagement) throws ParseException {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select the type of item you want to add ");
            System.out.println("1. Food ");
            System.out.println("2. Electronic ");
            System.out.println("3. Crockery ");
            System.out.println("4. List of items ");
            System.out.println("5. Exit ");
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    dshhManagement.addProduct(dshhManagement.addFood());
                    continue;
                }
                case 2: {
                    dshhManagement.addProduct(dshhManagement.addElectronic());
                    continue;
                }
                case 3: {
                    dshhManagement.addProduct(dshhManagement.addCrockery());
                    continue;
                }
                case 4: {
                    for (Product product: dshhManagement.getProductList()) {
                        if (product instanceof Food) {
                            System.out.println(((Food) product).toString());
                        } else if (product instanceof Electronic) {
                            System.out.println(((Electronic) product).toString());
                        } else if (product instanceof Crockery) {
                            System.out.println(((Crockery) product).toString());
                        }
                    }
                    continue;
                }
                case 5: System.exit(0);
            }
        }
    }
}
