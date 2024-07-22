package Practice.Practice2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Crockery extends Product {
    private String manufacturer;
    private LocalDate dateOfArrival;

    public Crockery(String code, String name, int inventoryQuantity, double price, String manufacturer, LocalDate dateOfArrival) {
        super(code, name, inventoryQuantity, price, 0.1);
        this.manufacturer = manufacturer;
        this.dateOfArrival = dateOfArrival;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public boolean checkStorageTime(LocalDate dateOfArrival) {
        return (ChronoUnit.DAYS.between(dateOfArrival, LocalDate.now()) > 10) ? false : true;
    }

    @Override
    public String measureConsumption() {
        return (this.getInventoryQuantity() > 50 && !checkStorageTime(this.getDateOfArrival())) ? "Slow sale" : "No comment";
    }

    @Override
    public String toString() {
        return "Code: " + this.getCode()
                + ", name: " + this.getName()
                + ", inventoryQuantity: " + this.getInventoryQuantity()
                + ", price: " + this.getPrice()
                + ", VAT: " + this.getVAT()
                + ", manufacturer: " + manufacturer
                + ", dateOfArrival: " + dateOfArrival;
    }
}
