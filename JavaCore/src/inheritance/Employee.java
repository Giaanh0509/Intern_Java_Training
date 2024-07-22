package inheritance;

public abstract class Employee {
    private String name;
    private int age;
    private String address;
    private double coefficients;
    protected final double basicSalary = 3500000;

    public Employee(String name, int age, String address, double coefficients) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.coefficients = coefficients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double coefficients) {
        this.coefficients = coefficients;
    }

    public void payRoll() {
        System.out.println("Employee's Salary: " + coefficients*basicSalary);
    }
}
