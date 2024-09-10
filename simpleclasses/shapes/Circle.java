package simpleclasses.shapes;

public class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
