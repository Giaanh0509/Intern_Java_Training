package practice.practice2;

import java.time.LocalDate;

public class Food extends Product {
    private LocalDate dateOfManufacture;
    private LocalDate dateOfExpiration;
    private String supplier;

    public Food(String code, String name, int inventoryQuantity, double price, LocalDate dateOfManufacture, LocalDate dateOfExpiration, String supplier) {
        super(code, name, inventoryQuantity, price, 0.05);
        if(checkValidate(dateOfManufacture, dateOfExpiration)) {
            this.dateOfManufacture = dateOfManufacture;
            this.dateOfExpiration = dateOfExpiration;
            this.supplier = supplier;
        }
        else throw new IllegalArgumentException("Expiration date must be after the date of manufacture\n");
    }

    public boolean checkValidate(LocalDate dateOfManufacture, LocalDate dateOfExpiration) {
        return (dateOfManufacture.compareTo(dateOfExpiration) < 0) ? true : false;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        if (checkValidate(dateOfManufacture, this.dateOfExpiration)) this.dateOfManufacture = dateOfManufacture;
        else throw new IllegalArgumentException("Expiration date must be after the date of manufacture\n");
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        if (checkValidate(this.dateOfManufacture, dateOfExpiration)) this.dateOfExpiration = dateOfExpiration;
        else throw new IllegalArgumentException("Expiration date must be after the date of manufacture\n");
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public boolean checkDateOfExpiration(LocalDate dateOfExpiration) {
        return (dateOfExpiration.compareTo(LocalDate.now()) < 0) ? true : false;
    }

    @Override
    public String measureConsumption() {
        return (this.getInventoryQuantity() > 0 && !checkDateOfExpiration(this.getDateOfExpiration())) ? "Hard to sell" : "No comment";
    }

    @Override
    public String toString() {
        return "Code: " + this.getCode()
                + ", name: " + this.getName()
                + ", inventoryQuantity: " + this.getInventoryQuantity()
                + ", price: " + this.getPrice()
                + ", VAT: " + this.getVAT()
                + ", dateOfManufacture: " + dateOfManufacture
                + ", dateOfExpiration: " + dateOfExpiration
                + ", supplier: " + supplier;
    }
}
