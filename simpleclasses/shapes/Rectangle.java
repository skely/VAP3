package simpleclasses.shapes;

public class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double computePerimeter() {
        return 2 * (width + height);
    }

    public double computeArea() {
        return width * height;
    }
}
