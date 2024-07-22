package Practice.Practice2;

public abstract class Product {
    private String code;
    private String name;
    private int inventoryQuantity;
    private double price;
    private double VAT;

    public Product(String code, String name, int inventoryQuantity, double price, double VAT) {
        if(checkInventoryQuantity(inventoryQuantity)) {
            this.code = code;
            this.name = name;
            this.inventoryQuantity = inventoryQuantity;
            this.price = price;
            this.VAT = VAT;
        }
        else throw new IllegalArgumentException("Inventory quantity must be greater than or equal to 0");
    }

    public boolean checkInventoryQuantity(int inventoryQuantity) {
       return (inventoryQuantity >= 0) ? true : false;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
       if (checkInventoryQuantity(inventoryQuantity)) this.inventoryQuantity = inventoryQuantity;
       else throw new IllegalArgumentException("Inventory quantity must be greater than or equal to 0");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public abstract String measureConsumption();
}
