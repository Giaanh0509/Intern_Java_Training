package Practice.Practice2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class DSHHManagement {
    private List<Product> productList;

    public DSHHManagement() {
    }

    public DSHHManagement(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if(productList != null) {
            for(Product exsistProduct: productList) {
                if(exsistProduct.getCode().equals(product.getCode())) {
                    throw new IllegalArgumentException("The product code already exists\n");
                }
            }
        }

        productList.add(product);
    }

    public Food addFood() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input product code: ");
        String code = scanner.nextLine();

        System.out.println("Input product name: ");
        String name = scanner.nextLine();

        System.out.println("Input product inventoryQuantity: ");
        int inventoryQuantity = scanner.nextInt();

        System.out.println("Input product price: ");
        double price = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input date Of Manufacture (dd-MM-yyyy): ");
        String dateOfManufactureStr = scanner1.nextLine();
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfManufacture = LocalDate.parse(dateOfManufactureStr, parser);

        System.out.println("Input date Of Expiration (dd-MM-yyyy): ");
        String dateOfExpirationStr = scanner1.nextLine();
        LocalDate dateOfExpiration = LocalDate.parse(dateOfExpirationStr, parser);

        System.out.println("Input the supplier: ");
        String supplier = scanner1.nextLine();

        Food food = new Food(code, name, inventoryQuantity, price, dateOfManufacture, dateOfExpiration, supplier);
        return food;
    }

    public Electronic addElectronic() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input product code: ");
        String code = scanner.nextLine();

        System.out.println("Input product name: ");
        String name = scanner.nextLine();

        System.out.println("Input product inventoryQuantity: ");
        int inventoryQuantity = scanner.nextInt();

        System.out.println("Input product price: ");
        double price = scanner.nextDouble();

        System.out.println("Input product warrantyPeriod: ");
        int warrantyPeriod = scanner.nextInt();

        System.out.println("Input product capacity: ");
        double capacity = scanner.nextDouble();

        Electronic electronic = new Electronic(code, name, inventoryQuantity, price, warrantyPeriod, capacity);
        return electronic;
    }

    public Crockery addCrockery() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input product code: ");
        String code = scanner.nextLine();

        System.out.println("Input product name: ");
        String name = scanner.nextLine();

        System.out.println("Input product inventoryQuantity: ");
        int inventoryQuantity = scanner.nextInt();

        System.out.println("Input product price: ");
        double price = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Input product manufacturer: ");
        String manufacturer = scanner1.nextLine();

        System.out.println("Input date Of Manufacture (dd-MM-yyyy): ");
        String dateOfArrivalStr = scanner1.nextLine();
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfArrival = LocalDate.parse(dateOfArrivalStr, parser);

        Crockery crockery = new Crockery(code, name, inventoryQuantity, price, manufacturer, dateOfArrival);
        return crockery;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
