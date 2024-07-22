package Practice.Practice2;

public class Electronic extends Product {
    private int warrantyPeriod;
    private double capacity;

    public Electronic(String code, String name, int inventoryQuantity, double price, int warrantyPeriod, double capacity) {
        super(code, name, inventoryQuantity, price, 0.1);
        if (checkCapacity(capacity)) {
            this.capacity = capacity;
        } else throw new IllegalArgumentException("Capacity must be greater than or equal to 0\n");

        if (checkWarrantyPeriod(warrantyPeriod)) {
            this.warrantyPeriod = warrantyPeriod;
        } else throw new IllegalArgumentException("Warranty period in months must be greater than or equal to 0\n");
    }

    public boolean checkCapacity(double capacity) {
        return capacity >= 0 ? true : false;
    }

    public boolean checkWarrantyPeriod(int warrantyPeriod) {
        return warrantyPeriod >= 0 ? true : false;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (checkWarrantyPeriod(warrantyPeriod)) this.warrantyPeriod = warrantyPeriod;
        else throw new IllegalArgumentException("Warranty period in months must be greater than or equal to 0\n");
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
       if (checkCapacity(capacity)) this.capacity = capacity;
       else throw new IllegalArgumentException("Capacity must be greater than or equal to 0\n");
    }

    @Override
    public String measureConsumption() {
        return (this.getInventoryQuantity() < 3) ? "Sold" : "No comment";
    }

    @Override
    public String toString() {
        return "Code: " + this.getCode()
                + ", name: " + this.getName()
                + ", inventoryQuantity: " + this.getInventoryQuantity()
                + ", price: " + this.getPrice()
                + ", VAT: " + this.getVAT()
                + ", warrantyPeriod: " + warrantyPeriod
                + ", capacity: " + capacity;
    }
}
