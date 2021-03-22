package inheritance05;

/**
 * Inheritance 05
 * This shows how to use Polymorphism by passing
 * subclass to a method that accepts a superclass type.
 */
public class Main05 {
    public static void main(String[] args) {
        Triangle05[] triangles = new Triangle05[] {
                new Triangle05(),
                new IsoscelesTriangle05(),
                new RightTriangle05()
        };

        for (Triangle05 triangle: triangles) {
            printShape(triangle);
        }

    }

    private static void printShape(Triangle05 triangle) {
        System.out.println("Print Shape: " + triangle.getName());
    }
}
