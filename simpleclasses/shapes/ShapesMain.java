package simpleclasses.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Circle(7);

        for (int i=0; i<shapes.length; i++) {
            System.out.println("Shape " + (i+1) + ":");
            System.out.println("Perimeter: " + shapes[i].computePerimeter());
            System.out.println("Area: " + shapes[i].computeArea());
            System.out.println();
        }
    }
}
