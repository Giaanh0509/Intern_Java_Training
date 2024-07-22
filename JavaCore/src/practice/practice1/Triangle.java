package practice.practice1;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    public double getSideA() {
        return this.getHeight();
    }

    public double getSideB() {
        return this.getWidth();
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return getSideA() + getSideB() + sideC;
    }

    // calculate area using Heron's formula :))
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    @Override
    public String toString() {
        return "Triangle [sideA=" + getSideA() + ", sideB=" + getSideB() + ", sideC=" + sideC + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
