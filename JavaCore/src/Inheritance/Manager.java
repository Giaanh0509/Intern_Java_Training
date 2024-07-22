package Inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String address, double coefficients, double bonus) {
        super(name, age, address, coefficients);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void payRoll() {
        System.out.println("Manager's Salary: " + this.getCoefficients()*basicSalary + bonus);
    }
}
