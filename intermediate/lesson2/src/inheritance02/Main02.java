package inheritance02;

/**
 * Inheritance 02
 * This shows three levels of inheritance.
 * 2nd level has overridden the parent/superclass method.
 */
public class Main02 {
    public static void main(String[] args) {
        System.out.println("First Shape: " + new Triangle().getName());

        System.out.println("Second Shape: " + new IsoscelesTriangle().getName());

        System.out.println("Third Shape: " + new RightTriangle().getName());
    }
}
