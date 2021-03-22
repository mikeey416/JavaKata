package inheritance04;

/**
 * Inheritance 04
 * This shows how to use constructor to change the value
 * of the inherited field via protected access.
 */
public class Main04 {
    public static void main(String[] args) {
        System.out.println("First Shape: " + new Triangle04().getName());

        System.out.println("Second Shape: " + new IsoscelesTriangle04().getName());

        System.out.println("Third Shape: " + new RightTriangle04().getName());
    }
}
