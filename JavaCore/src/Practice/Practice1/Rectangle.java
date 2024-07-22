package Practice.Practice1;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return this.getHeight()*this.getWidth();
    }

    public double getPerimeter() {
        return (this.getHeight()+this.getWidth())*2;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + getWidth() + ", height=" + getHeight() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
