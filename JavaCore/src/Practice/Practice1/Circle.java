package Practice.Practice1;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    public double getArea() {
        return this.getWidth()*this.getWidth()*3.14;
    }

    public double getPerimeter() {
        return 2*this.getHeight()*3.14;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + getWidth() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
