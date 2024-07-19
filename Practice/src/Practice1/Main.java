package Practice1;


public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(5, 5);
        System.out.println(shape);

        Rectangle rectangle = new Rectangle(6, 8);
        System.out.println(rectangle);

        Circle circle = new Circle(5);
        System.out.println(circle);
    }
}