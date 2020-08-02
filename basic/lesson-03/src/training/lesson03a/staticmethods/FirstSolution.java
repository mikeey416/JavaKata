package training.lesson03a.staticmethods;

public class FirstSolution {
    public static void main(String[] args) {
        displayJanAddress();

        System.out.println("First StaticMethod Java application");
    }

    public static void displayJanAddress() {
        System.out.println("Jan Medina Bagoongan");
        System.out.println("Poblacion");
        System.out.println("Floridablanca Pampanga");
    }

    /**
     *
     * public
     *      - access modifier, can be:
     *            private,
     *            protected,
     *            public or
     *            default if no access modifier is added.
     *
     * static
     *      - to identify that a method is static, can be access without creating a class
     *
     * void
     *      - defines return type, but void means there is no return value
     *
     * displayJanAddress
     *      - methodName, should be unique
     *
     */
}
