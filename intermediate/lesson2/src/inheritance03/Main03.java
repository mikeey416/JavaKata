package inheritance03;

/**
 * Inheritance 03
 * This shows how to use SUPER to
 * call superclass method inside the subclass.
 */
public class Main03 {
    public static void main(String[] args) {
        System.out.println("First Shape: " + new Triangle03().getName());

        System.out.println("Second Shape: " + new IsoscelesTriangle03().getName());

        System.out.println("Third Shape: " + new RightTriangle03().getName());
    }
}
